import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class connect {
	
	private Connection connection1 = null;
	
	private Statement statement = null;
	
	private ResultSet resultset = null;
	
	public void connect () {
		String servidor = "jdbc:mysql://localhost:3306/databasefriends";
		
		String usuario = "root";
		String senha = "";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try {
		
			this.connection1 = DriverManager.getConnection (servidor, usuario, senha);
			
			this.statement = this.connection1.createStatement();
		
		}
		
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}

	}	
	
	//Método para inserir cadastros
	public void  inserirContato(String nome,String apelido,String telefone) {
	try {
	
	//Guarda dentro da variavel query, o código que vai ser executado
	String query = 
	"insert into tbl_amigo (nomeAmigo,apelidoAmigo,telefoneAmigo) "
	+ "VALUES ('"+ nome+"','"+ apelido+"','"+telefone+"')"; 
		
		
		//executa o código dentro do sql
		this.statement.executeUpdate(query);
		
		
		JOptionPane.showMessageDialog(null, "Cadastro Realizado com sucesso");
	}	
	
	catch (Exception e) {
		System.out.println("Erro: "+ e.getMessage());
	}
		
	} //FIM DO MÉTODO CADASTRO
	
	//Metodo para listar amigos
	public ResultSet listarAmigos() {
				
				
		try {
			String query = "select * from tbl_amigo";
			this.resultset = this.statement.executeQuery(query);
				 
	}	catch (Exception e) {
		 System.out.println("Erro: "+ e.getMessage());
		  
		}
				
		return resultset;
	} // FIM DO MÉTODO LISTAR 
	
}

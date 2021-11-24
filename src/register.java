import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class register extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField apelido;
	private JTextField telefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					register frame = new register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastrese = new JLabel("Cadastre-se");
		lblCadastrese.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblCadastrese.setBounds(267, 28, 125, 14);
		contentPane.add(lblCadastrese);
		
		JLabel lblInsiraSeuNome = new JLabel("Insira seu nome aqui");
		lblInsiraSeuNome.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblInsiraSeuNome.setBounds(32, 97, 184, 14);
		contentPane.add(lblInsiraSeuNome);
		
		JLabel lblInsiraSeuApelido = new JLabel("Insira seu apelido aqui");
		lblInsiraSeuApelido.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblInsiraSeuApelido.setBounds(32, 140, 184, 14);
		contentPane.add(lblInsiraSeuApelido);
		
		JLabel lblInsiraSeuTelefone = new JLabel("Insira seu telefone aqui");
		lblInsiraSeuTelefone.setFont(new Font("Yu Gothic", Font.PLAIN, 16));
		lblInsiraSeuTelefone.setBounds(32, 185, 184, 14);
		contentPane.add(lblInsiraSeuTelefone);
		
		nome = new JTextField();
		nome.setBounds(227, 96, 142, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		apelido = new JTextField();
		apelido.setColumns(10);
		apelido.setBounds(227, 139, 142, 20);
		contentPane.add(apelido);
		
		telefone = new JTextField();
		telefone.setColumns(10);
		telefone.setBounds(226, 184, 142, 20);
		contentPane.add(telefone);
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String getNome = nome.getText();
				String getApelido = apelido.getText();
				String getTelefone = telefone.getText();
				
				connect conn = new connect();
				conn.connect();
				conn.inserirContato(getNome, getApelido, getTelefone);
				
				}
		});
		
		btnCadastrar.setForeground(Color.BLACK);
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(440, 97, 125, 57);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(440, 185, 125, 44);
		contentPane.add(btnCancelar);
	}
}

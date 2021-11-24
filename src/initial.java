import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class initial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initial frame = new initial();
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
	public initial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				info list = new info();
				list.show();
				dispose();
			}
		});
		
		btnListar.setBackground(new Color(255, 255, 255));
		btnListar.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		btnListar.setBounds(82, 227, 118, 31);
		contentPane.add(btnListar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				register reg = new register();
				reg.show();
				dispose();
			}
		});
		
		btnCadastrar.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(381, 227, 118, 31);
		contentPane.add(btnCadastrar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manager\\Documents\\eclipseLuna\\Bibliotecas\\Documentos\\interface1811\\src\\img\\img (2).png"));
		lblNewLabel.setBounds(245, 85, 98, 138);
		contentPane.add(lblNewLabel);
		
		JLabel lblMercadoLivre = new JLabel("MERCADO LIVRE");
		lblMercadoLivre.setFont(new Font("Tw Cen MT", Font.PLAIN, 22));
		lblMercadoLivre.setBounds(226, 34, 154, 14);
		contentPane.add(lblMercadoLivre);
	}
}

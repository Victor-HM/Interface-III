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
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

public class info extends JFrame {

	private JPanel contentPane;
	private JTable table;

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
	public info() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 370);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListar = new JButton("");
		btnListar.setBackground(new Color(255, 255, 255));
		btnListar.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		btnListar.setBounds(82, 227, 118, 31);
		contentPane.add(btnListar);
		
		JButton btn = new JButton("");
		
		btn.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		btn.setBackground(Color.WHITE);
		btn.setBounds(381, 227, 118, 31);
		contentPane.add(btn);
		
		table = new JTable();
		table.setEnabled(false);
		table.setBounds(58, 38, 453, 161);
		contentPane.add(table);
		
		connect bd = new connect();
		
		bd.connect();
		
		table.setModel(DbUtils.resultSetToTableModel(bd.listarAmigos()));
	}
}

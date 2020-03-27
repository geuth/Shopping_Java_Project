package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 317);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(93, 87, 76, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(93, 128, 76, 42);
		contentPane.add(lblPassword);
		
		username = new JTextField();
		username.setBounds(165, 99, 240, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(165, 140, 240, 20);
		contentPane.add(password);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(222, 183, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new customerInfo().setVisible(true);
				dispose();
			}
		});
		
		btnSignUp.setBounds(321, 183, 89, 23);
		contentPane.add(btnSignUp);
		
		JTextArea txtrEnterYourUsernamme = new JTextArea();
		txtrEnterYourUsernamme.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtrEnterYourUsernamme.setText("Enter your usernamme and password to log-in");
		txtrEnterYourUsernamme.setBackground(SystemColor.activeCaption);
		txtrEnterYourUsernamme.setBounds(118, 65, 279, 23);
		contentPane.add(txtrEnterYourUsernamme);
	}
	

}

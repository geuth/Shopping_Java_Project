package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import ProjectClass.CustomerAccount;
import ProjectClass.ProductsShop;
import ProjectClass.Shop;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;
	private JTextArea errorTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 244);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(loginPanel, BorderLayout.NORTH);
		loginPanel.setLayout(new GridLayout(2, 2, 0, 10));
		
		JLabel login = new JLabel("Login");
		login.setFont(new Font("Times New Roman", Font.BOLD, 14));
		login.setVerticalAlignment(SwingConstants.CENTER);
		loginPanel.add(login);
		
		loginField = new JTextField();
		loginField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		loginPanel.add(loginField);
		loginField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		loginPanel.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		loginPanel.add(passwordField);
		
		JPanel optionPanel = new JPanel();
		optionPanel.setBorder(null);
		contentPane.add(optionPanel, BorderLayout.CENTER);
		optionPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		optionPanel.add(panel);
		
		JButton Login = new JButton("Login");
		panel.add(Login);
		
		JButton createNewAccount = new JButton("Create New Account");
		panel.add(createNewAccount);
		
		JButton continueWithoutAccount = new JButton("Continue Without Account");
		continueWithoutAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 new ShopGUI().setVisible(true);
				 dispose();
				
				
			}
			
		});
		panel.add(continueWithoutAccount);
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((getUsername.equals((loginField))) 
						&& (CustomerAccount.get(i).getPassword.equals((passwordField)))) {
					
				} else {
					errorTextArea.append("Wrong Login and Password");
				}
			}
		});
		
		errorTextArea = new JTextArea();
		errorTextArea.setBackground(SystemColor.control);
		optionPanel.add(errorTextArea);
	}

}

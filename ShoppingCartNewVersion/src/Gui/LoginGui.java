package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.TitledBorder;

import Class.CustomerAccountClass;
import Class.CustomerLogin;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;


public class LoginGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField loginField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGui frame = new LoginGui();
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
	public LoginGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 469, 194);
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
		createNewAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateNewAccountGui newFrame = new CreateNewAccountGui();
				newFrame.setVisible(true);
				return;
			}
		});
		panel.add(createNewAccount);

		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BufferedReader selectedDocument;
				String log = loginField.getText();
				String psw = String.valueOf(passwordField.getPassword());
				if (log.equals("") || psw.equals("")) {
					JOptionPane.showMessageDialog(null, "No username or password entered.");
				} else {
					try {
						selectedDocument = new BufferedReader(new FileReader("src\\customer.csv"));
						String line;
						while ((line = selectedDocument.readLine()) != null) {
							String[] data = line.split(",");
							String firstName = data[0];
							String lastName = data[1];
							String address = data[2];
							String username = data[3];
							String password = data[4];

							// first check if names match
							if (log.equals(username)) {
								if (psw.equals(password)) {
									JOptionPane.showMessageDialog(null, "Succesful login.");
									// make a cusomerInfo object
									CustomerLogin logInformation = new CustomerLogin(username, password);
									CustomerAccountClass customerInfo = new CustomerAccountClass(firstName, lastName,
											address, logInformation);
									CustomerInfoGui frame = new CustomerInfoGui(customerInfo);
									frame.setVisible(true);
									dispose();
									
								} else {
									JOptionPane.showMessageDialog(null, "Wrong password or username.");
								}
							}
							}selectedDocument.close();
					} catch (Exception e1) {
						// if file is not found, write error
						JOptionPane.showMessageDialog(null, "File error.");
					}
					
				}

			}

		});
	}

}

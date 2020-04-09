package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.HeadlessException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customerInfo extends JFrame {

	private JPanel contentPane;
	private JTextField firstName;
	private JTextField lastName;
	private JTextField emailAddress;
	private JTextField username;
	private JTextField password;
	private JTextField phoneNumber;
	private customerInfo[] customer;
	private int numberCustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerInfo frame = new customerInfo();
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
	public customerInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 462, 398);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea txtrCreateANew = new JTextArea();
		txtrCreateANew.setFont(new Font("Times New Roman", Font.BOLD, 16));
		txtrCreateANew.setText("Create a new account.");
		txtrCreateANew.setBackground(SystemColor.activeCaption);
		txtrCreateANew.setBounds(132, 11, 156, 39);
		contentPane.add(txtrCreateANew);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setBounds(22, 51, 88, 26);
		contentPane.add(lblNewLabel);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblLastName.setBounds(22, 88, 88, 26);
		contentPane.add(lblLastName);

		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEmailAddress.setBounds(22, 128, 88, 26);
		contentPane.add(lblEmailAddress);

		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblUsername.setBounds(22, 165, 88, 26);
		contentPane.add(lblUsername);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPassword.setBounds(22, 202, 88, 26);
		contentPane.add(lblPassword);

		firstName = new JTextField();
		firstName.setBounds(115, 54, 252, 20);
		contentPane.add(firstName);
		firstName.setColumns(10);

		lastName = new JTextField();
		lastName.setColumns(10);
		lastName.setBounds(115, 94, 252, 20);
		contentPane.add(lastName);

		emailAddress = new JTextField();
		emailAddress.setColumns(10);
		emailAddress.setBounds(115, 131, 252, 20);
		contentPane.add(emailAddress);

		username = new JTextField();
		username.setColumns(10);
		username.setBounds(115, 165, 252, 20);
		contentPane.add(username);

		password = new JTextField();
		password.setColumns(10);
		password.setBounds(115, 205, 252, 20);
		contentPane.add(password);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPhoneNumber.setBounds(22, 239, 88, 26);
		contentPane.add(lblPhoneNumber);

		phoneNumber = new JTextField();
		phoneNumber.setColumns(10);
		phoneNumber.setBounds(115, 242, 252, 20);
		contentPane.add(phoneNumber);

		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lastname = lastName.getText();
				String firstname = firstName.getText();
				String userId = username.getText();
				String userPassword = password.getText();
				String email = emailAddress.getText();
				String phoneNum = phoneNumber.getText();
				
				new accountCreated().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(179, 308, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new login().setVisible(true);
				dispose();
			}
		});
		btnCancel.setBounds(278, 308, 89, 23);
		contentPane.add(btnCancel);

	}

	public customerInfo(JTextField firstName, JTextField lastName, JTextField emailAddress, JTextField username,
			JTextField password, int customerNumber) throws HeadlessException {
		super();
		numberCustomer = 0;
		customer = new customerInfo[customerNumber];
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.username = username;
		this.password = password;
		
		
	}

	public JTextField getFirstName() {
		return firstName;
	}

	public void setFirstName(JTextField firstName) {
		this.firstName = firstName;
	}

	public JTextField getLastName() {
		return lastName;
	}

	public void setLastName(JTextField lastName) {
		this.lastName = lastName;
	}

	public JTextField getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(JTextField emailAddress) {
		this.emailAddress = emailAddress;
	}

	public JTextField getUsername() {
		return username;
	}

	public void setUsername(JTextField username) {
		this.username = username;
	}

	public JTextField getPassword() {
		return password;
	}

	public void setPassword(JTextField password) {
		this.password = password;
	}

}

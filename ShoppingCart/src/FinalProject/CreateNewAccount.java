package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;


import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CreateNewAccount extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField addressTextField;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private ArrayList<CustomerAccount> newCustomer;
	private int customerNumber;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewAccount frame = new CreateNewAccount();
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
	public CreateNewAccount() {
		super("Create Account");
		customerNumber = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel customerInfo = new JPanel();
		customerInfo.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(customerInfo, BorderLayout.NORTH);
		customerInfo.setLayout(new GridLayout(6, 2, 0, 10));
		
		JLabel firstName = new JLabel("First Name");
		customerInfo.add(firstName);
		
		firstNameTextField = new JTextField();
		customerInfo.add(firstNameTextField);
		firstNameTextField.setColumns(10);
		
		JLabel lastNameLabel = new JLabel("Last Name");
		customerInfo.add(lastNameLabel);
		
		lastNameTextField = new JTextField();
		customerInfo.add(lastNameTextField);
		lastNameTextField.setColumns(10);
		
		JLabel address = new JLabel("Address");
		customerInfo.add(address);
		
		addressTextField = new JTextField();
		customerInfo.add(addressTextField);
		addressTextField.setColumns(10);
		
		JLabel usernameLabel = new JLabel("Username");
		customerInfo.add(usernameLabel);
		
		usernameTextField = new JTextField();
		customerInfo.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password");
		customerInfo.add(passwordLabel);
		
		passwordTextField = new JTextField();
		customerInfo.add(passwordTextField);
		passwordTextField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);
		
		JButton createAccount = new JButton("Create Account");
		createAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = firstNameTextField.getText();
				String lastName = lastNameTextField.getText();
				String address = addressTextField.getText();
				String username =  usernameTextField.getText();
				String password = passwordTextField.getText();
				CustomerAccount newCustomerAccount = new CustomerAccount(firstName, lastName, address, username, password);
				addCustomer(newCustomerAccount);
			}

			private void addCustomer(CustomerAccount newCustomerAccount) {
				newCustomer.add( newCustomerAccount);
				customerNumber++;
				
			}
		});
		panel.add(createAccount);
		
		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginFrame().setVisible(true);
				dispose();
			}
		});
		panel.add(cancel);
	}

}

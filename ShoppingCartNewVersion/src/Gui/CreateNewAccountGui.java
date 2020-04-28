package Gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Class.CustomerAccountClass;
import Class.CustomerLogin;

import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;

public class CreateNewAccountGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField addressTextField;
	private JTextField usernameTextField;
	private JTextField passwordTextField;
	private ArrayList<CustomerAccountClass> newCustomer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewAccountGui frame = new CreateNewAccountGui();
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
	public CreateNewAccountGui() {
		super("Create Account");
		newCustomer = new ArrayList<CustomerAccountClass>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JPanel customerInfo = new JPanel();
		customerInfo
				.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(customerInfo, BorderLayout.NORTH);
		customerInfo.setLayout(new GridLayout(7, 2, 0, 10));

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

		JTextArea errorTextArea = new JTextArea();
		errorTextArea.setBackground(SystemColor.control);
		customerInfo.add(errorTextArea);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);

		JButton createAccount = new JButton("Create Account");
		createAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					CustomerLogin newCustomerLogin = new CustomerLogin(usernameTextField.getText(),
							passwordTextField.getText());
					CustomerAccountClass newCustomerAccount = new CustomerAccountClass(firstNameTextField.getText(),
							lastNameTextField.getText(), addressTextField.getText(), newCustomerLogin);
					newCustomer.add(newCustomerAccount);

				} catch (Exception e1) {
					// if file is not found, write error
					errorTextArea.append("Error");
				}

				Writer newFile;

				try {
					newFile = new BufferedWriter(
							new OutputStreamWriter(new FileOutputStream("src\\customer.csv", true)));
					for (int i = 0; i < newCustomer.size(); i++) {
						// write each line in the file according
						CustomerAccountClass p = newCustomer.get(i);
						newFile.append(p.toString());
						
					}

					LoginGui logWindow = new LoginGui();
					logWindow.setVisible(true);					
					dispose();
					newFile.close();
					
				} catch (Exception e1) {
					// if file is not found, write error
					errorTextArea.append("Error file");
				}
			}

		});
		panel.add(createAccount);

		JButton cancel = new JButton("Cancel");
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginGui().setVisible(true);
				dispose();
			}
		});
		panel.add(cancel);
	}

}

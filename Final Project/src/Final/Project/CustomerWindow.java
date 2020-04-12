package Final.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class CustomerWindow {

	private JFrame frame;
	private JTextField lastNameTextfield;
	private JTextField firstNameTextfield;
	private JTextField passwordTextfield;
	private JTextField userNameTextfield;
	private JTextField addressTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerWindow window = new CustomerWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CustomerWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 544, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(5, 9, 0, 0));
		
		JLabel userName = new JLabel("User Name");
		panel.add(userName);
		
		userNameTextfield = new JTextField();
		panel.add(userNameTextfield);
		userNameTextfield.setColumns(10);
		
		JLabel pwTextfield = new JLabel("Password");
		panel.add(pwTextfield);
		
		passwordTextfield = new JTextField();
		panel.add(passwordTextfield);
		passwordTextfield.setColumns(10);
		
		JLabel customerFName = new JLabel("First Name");
		panel.add(customerFName);
		
		firstNameTextfield = new JTextField();
		panel.add(firstNameTextfield);
		firstNameTextfield.setColumns(10);
		
		JLabel customerLName = new JLabel("Last Name");
		panel.add(customerLName);
		
		lastNameTextfield = new JTextField();
		panel.add(lastNameTextfield);
		lastNameTextfield.setColumns(10);
		
		JLabel customerAddress = new JLabel("Address");
		panel.add(customerAddress);
		
		addressTextField = new JTextField();
		panel.add(addressTextField);
		addressTextField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JButton infoUpdate = new JButton("Update Information");
		panel_1.add(infoUpdate);
		
		JButton purchaseHistory = new JButton("Purchase History");
		panel_1.add(purchaseHistory);
		
		JButton startNewOrder = new JButton("New Order");
		panel_1.add(startNewOrder);
	}

}

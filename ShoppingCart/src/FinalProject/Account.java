package FinalProject;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Final Project Object Oriented Programming
//By Geu THAO 3/25/20

public class Account extends JFrame implements ActionListener{
	public static final int WIDTH = 500;
	public static final int HEIGTH = 400;
	public static final int NUMBER_OF_CHAR = 30;
	public static final int NUMBER_OF_CHARACTERS = 30;
	
	private JTextField username;
	private JTextField password;
	
	public static void main(String args[]) {
		Account gui = new Account();
		
	}
	
	public Account() {
		JFrame shoppingCartFrame = new JFrame("Account Log-in");

		JLabel entryText = new JLabel("Please enter your username and password");
		entryText.setBounds(70,90,280,30);
		
		
		
		
		JLabel loginLabel = new JLabel("Username :");
		loginLabel.setBounds(70,130,80,30);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setBounds(70, 170,80,30);
		
		username = new JTextField();
		username.setBounds(150, 135, 150, 25);
		
		password = new JTextField();
		password.setBounds(150, 175, 150, 25);
		
		
		JButton logIn = new JButton("Login");
		logIn.setBounds(215, 220, 80, 30);   
//		logIn.addActionListener(this);
		
	
		JButton newAccount = new JButton("Create Account");
		newAccount.setBounds(198, 260, 110, 30);   
//		newAccount.addActionListener(this);
		newAccount.setBackground(new Color(0,0,0,0));
		newAccount.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		
		shoppingCartFrame.add(entryText);
		shoppingCartFrame.add(loginLabel);
		shoppingCartFrame.add(passwordLabel);
		shoppingCartFrame.add(logIn);
		shoppingCartFrame.add(newAccount);
		shoppingCartFrame.add(username);
		shoppingCartFrame.add(password);
		shoppingCartFrame.setSize(400,400);
		shoppingCartFrame.setLayout(null);
		shoppingCartFrame.setVisible(true);
		

		
	}

	
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		if (actionCommand == "Login") {
				
		}
		if(actionCommand == "Create Account"){
			
		}
		
		
	}
	
	
}

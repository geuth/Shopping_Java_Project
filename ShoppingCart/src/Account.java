import javax.swing.*; 

public class Account {
	public static void main(String args[]) {
		JFrame shoppingCartFrame = new JFrame("Account Log-in");
		
		final JLabel loginText = new  JLabel();
		loginText.setBounds(50, 150, 200, 50);
		
		final JPasswordField passwordText = new JPasswordField();
		loginText.setBounds(500, 75, 100, 30);
		
		JLabel loginLabel = new JLabel("Username :");
		loginLabel.setBounds(50,20,80,30);
		
		JLabel passwordLabel = new JLabel("Password :");
		passwordLabel.setBounds(50,75,80,30);
		
		final JTextField text = new JTextField();
		text.setBounds(150, 20, 150, 25);
		
		final JTextField text2 = new JTextField();
		text2.setBounds(150, 80, 150, 25);
		
		JButton logIn = new JButton("Login");
		logIn.setBounds(215, 150, 80, 30);   
	
		
		
		shoppingCartFrame.add(loginText);
		shoppingCartFrame.add(loginLabel);
		shoppingCartFrame.add(passwordLabel);
		shoppingCartFrame.add(passwordText);
		shoppingCartFrame.add(loginText);
		shoppingCartFrame.add(text);
		shoppingCartFrame.add(text2);
		shoppingCartFrame.add(logIn);
		shoppingCartFrame.setSize(400,400);
		shoppingCartFrame.setLayout(null);
		shoppingCartFrame.setVisible(true);
	}
}

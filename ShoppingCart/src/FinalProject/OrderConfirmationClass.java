package FinalProject;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class OrderConfirmationClass {
	public static final int WIDTH = 500;
	public static final int HEIGTH = 400;
	public static final int NUMBER_OF_CHAR = 30;
	public static final int NUMBER_OF_CHARACTERS = 30;
	
	public static void main(String args[]) {
		Account gui = new Account();
		
	}
	
	public OrderConfirmationClass(){
		JFrame confirmationCartFrame = new JFrame("Order Confirmed");
		
		JLabel confirmationText = new JLabel("Your order has been confirmed");
		confirmationText.setBounds(50,20,80,30);
		
		confirmationCartFrame.add(confirmationText);
		
		confirmationCartFrame.setLayout(null);
		confirmationCartFrame.setVisible(true);
	}
}

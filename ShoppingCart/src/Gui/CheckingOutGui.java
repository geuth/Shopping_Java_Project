package Gui;

import ProjectClass.Computer;
import ProjectClass.ComputerAccesories;
import ProjectClass.Products;
import ProjectClass.ProductsShop;
import ProjectClass.Computer;
import ProjectClass.ComputerAccesories;
import ProjectClass.Products;
import ProjectClass.ProductsShop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckingOutGui extends JFrame {

	private JPanel contentPane;
	private JTextField creditCardNumberTextField;
	private JTextField cvcTextField;
	private JPanel panel;
	private JTextField textField;
	private JPanel panel_1;
	private JButton payButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckingOutGui frame = new CheckingOutGui();
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
	public CheckingOutGui() {
		setTitle("Check Out");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 234);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 10));
		
		JPanel creditCardInfoPanel = new JPanel();
		contentPane.add(creditCardInfoPanel);
		creditCardInfoPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		JLabel creditCardInfoLabel = new JLabel("Enter Credit Card Info");
		creditCardInfoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		creditCardInfoPanel.add(creditCardInfoLabel);
		
		creditCardNumberTextField = new JTextField();
		creditCardNumberTextField.setText("");
		creditCardInfoPanel.add(creditCardNumberTextField);
		creditCardNumberTextField.setColumns(10);
		
		JLabel cvcLabel = new JLabel("CVC numbers");
		cvcLabel.setHorizontalAlignment(SwingConstants.CENTER);
		creditCardInfoPanel.add(cvcLabel);
		
		cvcTextField = new JTextField();
		creditCardInfoPanel.add(cvcTextField);
		cvcTextField.setColumns(10);
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		textField = new JTextField();
		textField.append("The total is" + products.computeTotal(this) + "\n");
		panel.add(textField);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		payButton = new JButton("Pay");
		payButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SuccesfulPurchaseGui().setVisible(true);
				dispose();
				
			}
		});
		panel_1.add(payButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShopGui().setVisible(true);
				dispose();
			}
		});
		panel_1.add(cancelButton);
	}

}

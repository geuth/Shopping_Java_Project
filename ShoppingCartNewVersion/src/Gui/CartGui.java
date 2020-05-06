package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Class.CustomerAccountClass;
import Class.OrderId;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CartGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField creditCardTextField;
	private JTextField cvsNumTextField;
	private static double totalSum;
	private DecimalFormat formatprice = new DecimalFormat("#0.00");
	private Date actualDate = new Date();
	private JScrollPane scrollBar;
	private long packageNumber = 100000000L + new Random().nextInt(900000000);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartGui frame = new CartGui(null, totalSum, null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 * @param totalSum
	 * @param customerInfo
	 * @param totalcost
	 */
	public CartGui(OrderId orderNum, double totalSum, CustomerAccountClass customerInfo) {
		setTitle("Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));

		JPanel summaryTextArea = new JPanel();
		summaryTextArea.setBorder(
				new TitledBorder(null, "Shopping Summary", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(summaryTextArea);
		summaryTextArea.setLayout(new BorderLayout(0, 0));

		JTextArea shoppingSummaryTextArea = new JTextArea();
		shoppingSummaryTextArea.append("\nThe order summary :" + orderNum.toString() + "\nDate : " + actualDate
				+ "\nTotal :" + formatprice.format(totalSum));
		scrollBar = new JScrollPane(shoppingSummaryTextArea);
		summaryTextArea.add(scrollBar, BorderLayout.CENTER);

		JPanel checkOutPanel = new JPanel();
		contentPane.add(checkOutPanel);
		checkOutPanel.setLayout(new GridLayout(2, 2, 0, 0));

		JPanel creditCardInfoPanel = new JPanel();
		checkOutPanel.add(creditCardInfoPanel);
		creditCardInfoPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel creditCardLabel = new JLabel("Credit Card Number\r\n");
		creditCardInfoPanel.add(creditCardLabel);

		creditCardTextField = new JTextField();
		creditCardInfoPanel.add(creditCardTextField);
		creditCardTextField.setColumns(17);

		JLabel cvsNumLabel = new JLabel("CVS");
		creditCardInfoPanel.add(cvsNumLabel);

		cvsNumTextField = new JTextField();
		creditCardInfoPanel.add(cvsNumTextField);
		cvsNumTextField.setColumns(10);

		JPanel buttonPanel = new JPanel();
		checkOutPanel.add(buttonPanel);

		JButton checkOutButton = new JButton("Check Out");
		buttonPanel.add(checkOutButton);

		JButton shopButton = new JButton("Continue Shopping");
		buttonPanel.add(shopButton);

		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JButton profileButton = new JButton("Go Back To Profile");
		profileButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerInfoGui infoGui = new CustomerInfoGui(customerInfo);
				infoGui.setVisible(true);
				dispose();
			}
		});
		buttonPanel.add(profileButton);
		buttonPanel.add(exitButton);
		shopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductsGui(customerInfo).setVisible(true);
				dispose();
			}
		});
		checkOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String credit = creditCardTextField.getText();
				String cvsNum = cvsNumTextField.getText();
				if (credit.length() == 16 && cvsNum.length() == 3) {
					JOptionPane.showMessageDialog(null,
							"Successful purcharse!\n Your package number is :" + packageNumber);
					FileWriter newFile;
					try {
						newFile = new FileWriter(customerInfo.getFirstName() + "cart.csv");
						if (orderNum.toString() != null) {
							newFile.append(orderNum.toString()+ ",\nPackage Number :" + 
									packageNumber +"\nDate: "+ actualDate + "\n");
							
						}
						
						newFile.close();
						shoppingSummaryTextArea.setText(null);
					} catch (IOException e1) {

						shoppingSummaryTextArea.setText("Error");
					}

				} else if (credit.length() == 13 && cvsNum.length() == 3) {
					JOptionPane.showMessageDialog(null,
							"Succesfull purcharse!\n Your package number is :" + packageNumber);
					FileWriter newFile;
					try {
						newFile = new FileWriter(customerInfo.getFirstName() + "cart.csv");
						if (orderNum.toString() != null) {
							newFile.append(orderNum.toString()+ ",\nPackage Number :" + 
									packageNumber +"\nDate: "+ actualDate);
						}
						newFile.close();
						shoppingSummaryTextArea.setText(null);
					} catch (IOException e1) {

						shoppingSummaryTextArea.setText("Error");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Wrong card number!");
				}
			}
		});
	}

}

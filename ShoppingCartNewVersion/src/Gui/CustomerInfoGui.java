package Gui;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import Class.CustomerAccountClass;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class CustomerInfoGui extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final GraphicsConfiguration CustomerAccountClass = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerInfoGui frame = new CustomerInfoGui(null);
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
	public CustomerInfoGui(CustomerAccountClass customer) {
		setTitle("Customer Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 0, 0));

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Informations", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JTextArea infoTextArea = new JTextArea();
		infoTextArea.append("Welcome " + customer.getFirstName() +"\n" + "Your informations are :\n"+ customer.infoCustomer());
		infoTextArea.setEditable(false);
		panel.add(infoTextArea, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_1, BorderLayout.SOUTH);

		JButton shopButton = new JButton("Start Shopping!");
		shopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ProductsGui(customer).setVisible(true);
				dispose();
			}
		});
		panel_1.add(shopButton);

		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LoginGui().setVisible(true);
				dispose();
			}
		});
		
		JButton previousPurcharseButton = new JButton("Purchase History");
		previousPurcharseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PurchaseHistoryGui purchaseHistory = new PurchaseHistoryGui(customer);
				purchaseHistory.setVisible(true);
				dispose();
			}
		});
		previousPurcharseButton.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(previousPurcharseButton);
		panel_1.add(exitButton);
	}

}

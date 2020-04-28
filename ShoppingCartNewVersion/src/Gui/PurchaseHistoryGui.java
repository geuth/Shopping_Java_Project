package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Class.CustomerAccountClass;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.awt.event.ActionEvent;

public class PurchaseHistoryGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseHistoryGui frame = new PurchaseHistoryGui(null);
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
	 * @param customer
	 */
	public PurchaseHistoryGui(CustomerAccountClass customer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 0, 0, 0));

		JLabel purcharseHistoryLabel = new JLabel("Purcharse History");
		purcharseHistoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		purcharseHistoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(purcharseHistoryLabel);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JTextArea historyTextArea = new JTextArea();
		BufferedReader selectedDocument;
		String line;
		try {
			selectedDocument = new BufferedReader(new FileReader(customer.getFirstName() + "cart.csv"));
			if ((line = selectedDocument.readLine()) != null) {
				historyTextArea.append("" + line + "\n");
			}
			selectedDocument.close();

		} catch (Exception e2) {
			historyTextArea.append("Purcharse History Is Empty");
		}
		scrollPane.setViewportView(historyTextArea);
		historyTextArea.setEditable(false);
		JPanel panel = new JPanel();
		contentPane.add(panel);

		JButton infoBackButton = new JButton("Go Back Customer Information");
		infoBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerInfoGui customerInformation = new CustomerInfoGui(customer);
				customerInformation.setVisible(true);
				dispose();
			}
		});
		panel.add(infoBackButton);

		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		panel.add(exitButton);
	}

}

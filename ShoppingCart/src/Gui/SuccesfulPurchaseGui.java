package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;

public class SuccesfulPurchaseGui extends JFrame {

	private JPanel SuccessfulPurchasePane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccesfulPurchaseGui frame = new SuccesfulPurchaseGui();
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
	public SuccesfulPurchaseGui() {
		setTitle("Succesful Purchase");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 285);
		SuccessfulPurchasePane = new JPanel();
		SuccessfulPurchasePane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(SuccessfulPurchasePane);
		SuccessfulPurchasePane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel = new JPanel();
		SuccessfulPurchasePane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		SuccessfulPurchasePane.add(panel_1);
		
		JButton goBackShopButton = new JButton("Shop More");
		panel_1.add(goBackShopButton);
		
		JButton exitButton = new JButton("Exit");
		panel_1.add(exitButton);
	}

}

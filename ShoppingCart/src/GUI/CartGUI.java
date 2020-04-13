package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class CartGUI extends JFrame {

	private JPanel contentPane;
	private JTextField shoppingSummaryTextField;
	private JTextField textField;
	private JTextField succesfullyRemoveTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartGUI frame = new CartGUI();
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
	public CartGUI() {
		setTitle("Cart");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 514, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel summaryTextArea = new JPanel();
		summaryTextArea.setBorder(new TitledBorder(null, "Shopping Summary", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(summaryTextArea);
		summaryTextArea.setLayout(new BorderLayout(0, 0));
		
		shoppingSummaryTextField = new JTextField();
		shoppingSummaryTextField.append("The total is" + products.computeTotal() + "\n" + products.toString() + "\n");
		summaryTextArea.add(shoppingSummaryTextField);
		shoppingSummaryTextField.setColumns(10);
		
		JPanel buttonPanel = new JPanel();
		contentPane.add(buttonPanel);
		buttonPanel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JPanel panel = new JPanel();
		buttonPanel.add(panel);
		
		JButton checkOutButton = new JButton("Check Out");
		checkOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CheckingOutGUI().setVisible(true);
				dispose();
			}
		});
		panel.add(checkOutButton);
		
		JButton shopButton = new JButton("Continue Shopping");
		shopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ShopGUI().setVisible(true);
				dispose();
			}
		});
		panel.add(shopButton);
		
		JPanel panel_1 = new JPanel();
		buttonPanel.add(panel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton removeButton = new JButton("Remove");
		panel_1.add(removeButton);
		
		succesfullyRemoveTextField = new JTextField();
		succesfullyRemoveTextField.setBackground(SystemColor.control);
		panel_1.add(succesfullyRemoveTextField);
		succesfullyRemoveTextField.setColumns(10);
	}

}

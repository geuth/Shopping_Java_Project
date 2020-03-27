package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class accountCreated extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					accountCreated frame = new accountCreated();
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
	public accountCreated() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 328);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrYourAccountHas = new JTextArea();
		txtrYourAccountHas.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtrYourAccountHas.setText("Your account has been created succesfully!");
		txtrYourAccountHas.setBackground(SystemColor.activeCaption);
		txtrYourAccountHas.setBounds(59, 92, 346, 73);
		contentPane.add(txtrYourAccountHas);
		
		JButton btnNewButton = new JButton("Go back to log-in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new login().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(109, 169, 115, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(252, 169, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}

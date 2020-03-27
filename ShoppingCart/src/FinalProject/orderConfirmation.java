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

public class orderConfirmation extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					orderConfirmation frame = new orderConfirmation();
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
	public orderConfirmation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 368);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrOrderSuccesfullyCompleted = new JTextArea();
		txtrOrderSuccesfullyCompleted.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtrOrderSuccesfullyCompleted.setText("Order succesfully completed! \r\nYour order will be processed \r\nin the next 24hours.");
		txtrOrderSuccesfullyCompleted.setBackground(SystemColor.activeCaption);
		txtrOrderSuccesfullyCompleted.setBounds(126, 104, 264, 103);
		contentPane.add(txtrOrderSuccesfullyCompleted);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnNewButton.setBounds(271, 203, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnGoBackProfile = new JButton("Go back profile");
		btnGoBackProfile.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnGoBackProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGoBackProfile.setBounds(136, 203, 115, 23);
		contentPane.add(btnGoBackProfile);
	}

}

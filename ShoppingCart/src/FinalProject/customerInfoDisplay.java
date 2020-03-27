package FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;

public class customerInfoDisplay extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customerInfoDisplay frame = new customerInfoDisplay();
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
	public customerInfoDisplay() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 481);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionText);
		panel.setBounds(29, 26, 78, 73);
		contentPane.add(panel);
		
		JTextArea txtrWelcomeBackTo = new JTextArea();
		txtrWelcomeBackTo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		txtrWelcomeBackTo.setText("Welcome back to your account!");
		txtrWelcomeBackTo.setBackground(SystemColor.activeCaption);
		txtrWelcomeBackTo.setBounds(121, 40, 291, 52);
		contentPane.add(txtrWelcomeBackTo);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(43, 130, 78, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLastName.setBounds(43, 167, 78, 14);
		contentPane.add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEmail.setBounds(43, 206, 78, 14);
		contentPane.add(lblEmail);
	}
}

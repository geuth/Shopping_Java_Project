package Final.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class FinalProject {

	private JFrame accountLoginFrame;
	private JPasswordField loginPasswordField;
	private JPasswordField pwPasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalProject window = new FinalProject();
					window.accountLoginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FinalProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		accountLoginFrame = new JFrame();
		accountLoginFrame.setBounds(100, 100, 450, 300);
		accountLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel Login_Panel = new JPanel();
		accountLoginFrame.getContentPane().add(Login_Panel, BorderLayout.NORTH);
		Login_Panel.setLayout(new GridLayout(2, 2, 20, 30));
		
		JLabel lblNewLabel = new JLabel("Login");
		Login_Panel.add(lblNewLabel);
		
		loginPasswordField = new JPasswordField();
		Login_Panel.add(loginPasswordField);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		Login_Panel.add(lblNewLabel_1);
		
		pwPasswordField = new JPasswordField();
		Login_Panel.add(pwPasswordField);
		
		JPanel Password_Panel = new JPanel();
		accountLoginFrame.getContentPane().add(Password_Panel, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Password_Panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New Account");
		Password_Panel.add(btnNewButton_1);
		
		JButton skipToCart = new JButton("Skip Account");
		skipToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CustomerWindow().setVisible(true);
				dispose();
			}
		});
		Password_Panel.add(skipToCart);
		
		JScrollPane scrollPane = new JScrollPane();
		Password_Panel.add(scrollPane);
	}

}

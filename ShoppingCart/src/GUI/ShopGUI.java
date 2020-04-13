package GUI;

import ProjectClass.Computer;
import ProjectClass.ComputerAccesories;
import ProjectClass.Products;
import ProjectClass.ProductsShop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Hashtable;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import ProjectClass.Computer;
import ProjectClass.ComputerAccesories;
import ProjectClass.Products;
import ProjectClass.ProductsShop;
import java.awt.SystemColor;

public class ShopGUI extends JFrame {

	private JPanel contentPane;
	private JTextField quantityTextField;
	private ProductsShop products = new ProductsShop(5);
	private JComboBox comboBox;
	private JTextArea outputArea;
	private JComboBox productType;
	private JLabel priceLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopGUI frame = new ShopGUI();
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
	public ShopGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(2, 1, 0, 0));

		JPanel mainPanel = new JPanel();
		contentPane.add(mainPanel);
		mainPanel.setLayout(new BorderLayout(0, 0));

		JPanel panel_1 = new JPanel();
		mainPanel.add(panel_1, BorderLayout.SOUTH);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = (String) comboBox.getSelectedItem();
				String name = (String) productType.getSelectedItem();
				if (name.equalsIgnoreCase("Mac")) {
					priceLabel.setText("999.99");
				} else if (name.equalsIgnoreCase("Asus")) {
					priceLabel.setText("879.99");
				} else if (name.equalsIgnoreCase("Mouse")) {
					priceLabel.setText("18.70");
				} else if (name.equalsIgnoreCase("Headphones")) {
					priceLabel.setText("30.40");
					
				}
				double price = Double.parseDouble(priceLabel.getText());
				int qty = Integer.parseInt(quantityTextField.getText());

				if (type.equalsIgnoreCase("Computer Accesories")) {
					Products computerAccesories = new ComputerAccesories(name, price, qty);
					products.addProduct(computerAccesories);
					outputArea.append("Product added\n");
				} else if (type.equalsIgnoreCase("Computer")) {
					Products computerKind = new Computer(name, price, qty);
					products.addProduct(computerKind);
					outputArea.append("Product added\n");
				}

			}
		});
		panel_1.add(btnAdd);
		
				JButton btnDisplay = new JButton("Go to cart");
				btnDisplay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						outputArea.append(products.toString() + "\n");
					}
				});
				panel_1.add(btnDisplay);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Products", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainPanel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 4, 0, 30));

		JLabel productName = new JLabel("Product");
		productName.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(productName);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Select", "Computer", "Computer Accesories" }));
		comboBox.setBackground(Color.WHITE);
		panel_2.add(comboBox);
		
		JButton productTypeButton = new JButton("Select");
		productTypeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productCategory = (String)comboBox.getSelectedItem();
				if (productCategory.equalsIgnoreCase("Computer Accesories")) {
					productType.setModel(new DefaultComboBoxModel(new String[] { "Select", "Headphones", "Mouse"}));
				}
				if (productCategory.equalsIgnoreCase("Computer")) {
					productType.setModel(new DefaultComboBoxModel(new String[] { "Select", "MAC", "ASUS"}));
				}
			}
		});
		panel_2.add(productTypeButton);

		JLabel lblNewLabel_2 = new JLabel("");
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);

		productType = new JComboBox();
		productType.setBackground(Color.WHITE);
		panel_2.add(productType);
		
		JButton selectButton = new JButton("Select");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String) productType.getSelectedItem();
				if (name.equalsIgnoreCase("Mac")) {
					priceLabel.setText("999.99");
					priceLabel.setVisible(true);
				} else if (name.equalsIgnoreCase("Asus")) {
					priceLabel.setText("879.99");
				} else if (name.equalsIgnoreCase("Mouse")) {
					priceLabel.setText("18.70");
				} else if (name.equalsIgnoreCase("Headphones")) {
					priceLabel.setText("30.40");
				}
			}
		});
		panel_2.add(selectButton);

		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_5);
		
		priceLabel = new JLabel("");
		priceLabel.setBackground(SystemColor.window);
		panel_2.add(priceLabel);

		JLabel lblNewLabel_6 = new JLabel("Quantity");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_6);

		quantityTextField = new JTextField();
		panel_2.add(quantityTextField);
		quantityTextField.setColumns(10);

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.NORTH);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Output", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		outputArea = new JTextArea();
		panel_4.add(outputArea, BorderLayout.CENTER);
	}
}

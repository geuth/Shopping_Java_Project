package GUI;

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

public class ShopGUI extends JFrame {

	private JPanel contentPane;
	private JTextField quantityTextField;
	private JTextField searchTextField;
	private ProductsShop products = new ProductsShop(5);
	private JComboBox comboBox;
	private JTextArea outputArea;
	private JComboBox productType;
	private JTextField priceTextField;

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

		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(products.toString() + "\n");
			}
		});
		panel_1.add(btnDisplay);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = (String) comboBox.getSelectedItem();
				String name = (String) productType.getSelectedItem();
				if (name.equalsIgnoreCase("Mac")) {
					priceTextField.setText("999.99");
					priceTextField.setVisible(true);
				}else if (name.equalsIgnoreCase("Asus")) {
					priceTextField.setText("879.99");
					priceTextField.setVisible(true);
				}else if (name.equalsIgnoreCase("Mouse")) {
					priceTextField.setText("18.70");
					priceTextField.setVisible(true);
				}else if (name.equalsIgnoreCase("Headphones")) {
					priceTextField.setText("30.40");
					priceTextField.setVisible(true);
				}
				double price = Double.parseDouble(priceTextField.getText());
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

		JButton removeBtn = new JButton("Remove");
		removeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = (String) comboBox.getSelectedItem();
				String name = (String) productType.getSelectedItem();
				if (name.equalsIgnoreCase("Mac")) {
					priceTextField.setText("999.99");
					priceTextField.setVisible(true);
				}else if (name.equalsIgnoreCase("Asus")) {
					priceTextField.setText("879.99");
					priceTextField.setVisible(true);
				}else if (name.equalsIgnoreCase("Mouse")) {
					priceTextField.setText("18.70");
					priceTextField.setVisible(true);
				}else if (name.equalsIgnoreCase("Headphones")) {
					priceTextField.setText("30.40");
					priceTextField.setVisible(true);
				}
				double price = Double.parseDouble(priceTextField.getText());
				int qty = Integer.parseInt(quantityTextField.getText());

				Products target = null;
				if (type.equalsIgnoreCase("Computer Accesories")) {
					target = new ComputerAccesories(name, price, qty);

				} else if (type.equalsIgnoreCase("Computer")) {
					target = new Computer(name, price, qty);
				}
				
				outputArea.append("Produce" + products.remove(target));

			}
		});
		panel_1.add(removeBtn);
		
		JButton checkOutButton = new JButton("Check Out");
		checkOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append("The total is" + products.computeTotal() +"\n");
			}
		});
		panel_1.add(checkOutButton);

		
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

		JLabel lblNewLabel = new JLabel("");
		panel_2.add(lblNewLabel);

		JLabel lblNewLabel_2 = new JLabel("");
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);

		productType = new JComboBox();
		productType.setModel(new DefaultComboBoxModel(new String[] { "Select", "Headphones", "Mouse", "MAC", "Asus" }));
		productType.setBackground(Color.WHITE);
		panel_2.add(productType);

		JLabel lblNewLabel_4 = new JLabel("");
		panel_2.add(lblNewLabel_4);

		JLabel lblNewLabel_1 = new JLabel("");
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_5 = new JLabel("Price");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_5);
		
		priceTextField = new JTextField();
		panel_2.add(priceTextField);
		priceTextField.setColumns(10);

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

		searchTextField = new JTextField();
		panel_3.add(searchTextField);
		searchTextField.setColumns(10);

		JButton searchButton = new JButton("Search");
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String produceName = searchTextField.getText();
				outputArea.append(produceName + "found" + products.search(produceName)+"\n");
			}
		});
		panel_3.add(searchButton);

		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(null);
			}
		});
		panel_3.add(clearButton);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Output", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		outputArea = new JTextArea();
		panel_4.add(outputArea, BorderLayout.CENTER);
	}
}

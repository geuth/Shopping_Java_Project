package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import Class.CustomerAccountClass;
import Class.Electronics;
import Class.KitchenAndDining;
import Class.OrderId;
import Class.PersonalCareCategory;
import Class.ProductType;

import java.awt.SystemColor;

public class ProductsGui extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField quantityTextField;
	private ArrayList<ProductType> products = new ArrayList<>();
	private JComboBox<Object> productCategories;
	private JTextArea outputArea;
	private JComboBox<Object> productType;
	private JLabel priceLabel;
	private JScrollPane scroll;
	private double totalSum;
	JFileChooser chooser = new JFileChooser("src/customerCart.csv");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductsGui frame = new ProductsGui(null);
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
	 * @param customerInfo
	 * @param customeraccountclass
	 */
	public ProductsGui(CustomerAccountClass customerInfo) {
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
				String type = (String) productCategories.getSelectedItem();
				String name = (String) productType.getSelectedItem();
				double price = Double.parseDouble(priceLabel.getText());
				int qty;
				try {
					qty = Integer.parseInt(quantityTextField.getText());
					if (type.equalsIgnoreCase("Personal Care Category")) {
						ProductType personalCare = new PersonalCareCategory(name, price, qty);
						products.add(personalCare);
						outputArea.append("Product added\n");
					} else if (type.equalsIgnoreCase("Electronics")) {
						ProductType ElectronicsKind = new Electronics(name, price, qty);
						products.add(ElectronicsKind);
						outputArea.append("Product added\n");
					} else if (type.equalsIgnoreCase("Kitchen And Dining")) {
						ProductType kitchenware = new KitchenAndDining(name, price, qty);
						products.add(kitchenware);
						outputArea.append("Product added\n");
					}
					for (int i = 0; i < products.size(); i++)

					{
						ProductType item = products.get(i);
						totalSum += item.getPrice() * item.getQty();
					}

				} catch (Exception e2) {
					outputArea.append("You didn't enter the right format of quantity!\n");
				}

			}
		});
		panel_1.add(btnAdd);

		JButton btnDisplay = new JButton("Go to Cart Summary");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrderId orderNum = new OrderId(products);
				new CartGui(orderNum, totalSum, customerInfo).setVisible(true);
				dispose();
			}
		});

		JButton displayButton = new JButton("Display Cart");
		displayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				outputArea.append(products.toString() + "\n");
			}
		});
		panel_1.add(displayButton);
		panel_1.add(btnDisplay);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "Products", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		mainPanel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(0, 4, 0, 30));

		JLabel productName = new JLabel("Product");
		productName.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(productName);

		productCategories = new JComboBox<Object>();
		productCategories.setModel((ComboBoxModel<Object>) new DefaultComboBoxModel<Object>(
				new String[] { "Select", "Electronics", "Personal Care Category", "Kitchen and Dining" }));
		productCategories.setBackground(Color.WHITE);
		panel_2.add(productCategories);

		JButton productTypeButton = new JButton("Select");
		productTypeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String productCategory = (String) productCategories.getSelectedItem();
				if (productCategory.equalsIgnoreCase("Personal Care Category")) {
					productType.setModel(
							new DefaultComboBoxModel<Object>(new String[] { "Select", "Shampoo", "Hand Cream" }));
				}
				if (productCategory.equalsIgnoreCase("Electronics")) {
					productType.setModel(new DefaultComboBoxModel<Object>(new String[] { "Select", "MAC", "ASUS" }));
				}
				if (productCategory.equalsIgnoreCase("Kitchen and Dining")) {
					productType.setModel(new DefaultComboBoxModel<Object>(new String[] { "Select", "Fork", "Spoon" }));
				}
			}
		});
		panel_2.add(productTypeButton);

		JLabel lblNewLabel_2 = new JLabel("");
		panel_2.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);

		productType = new JComboBox<Object>();
		productType.setBackground(Color.WHITE);
		panel_2.add(productType);

		JButton selectButton = new JButton("Select");
		selectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = (String) productType.getSelectedItem();
				if (name.equalsIgnoreCase("Mac")) {
					priceLabel.setText("729.79");
					priceLabel.setVisible(true);
				} else if (name.equalsIgnoreCase("Asus")) {
					priceLabel.setText("879.99");
				} else if (name.equalsIgnoreCase("Hand Cream")) {
					priceLabel.setText("3.70");
				} else if (name.equalsIgnoreCase("Shampoo")) {
					priceLabel.setText("10.40");
				} else if (name.equalsIgnoreCase("Fork")) {
					priceLabel.setText("1.40");
				} else if (name.equalsIgnoreCase("Spoon")) {
					priceLabel.setText("3.40");
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

		JButton removeButton = new JButton("Remove Item");
		removeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String type = (String) productCategories.getSelectedItem();
				String name = (String) productType.getSelectedItem();
				double price = Double.parseDouble(priceLabel.getText());

				int qty;
				try {
					qty = Integer.parseInt(quantityTextField.getText());
					ProductType itemToRemove = null;
					if (type.equalsIgnoreCase("Personal Care Category")) {
						itemToRemove = new PersonalCareCategory(name, price, qty);
					} else if (type.equalsIgnoreCase("Electronics")) {
						itemToRemove = new Electronics(name, price, qty);
					} else if (type.equalsIgnoreCase("Electronics")) {
						itemToRemove = new Electronics(name, price, qty);
					}
					products.remove(itemToRemove);
					outputArea.append("\n" + name + " was removed!\n");

				} catch (NumberFormatException e1) {
					outputArea.append("You didn't enter a valable number for the quantity!");
				}

			}

		});
		panel_3.add(removeButton);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Output", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));
		outputArea = new JTextArea();
		scroll = new JScrollPane(outputArea);
		panel_4.add(scroll, BorderLayout.CENTER);
	}

}

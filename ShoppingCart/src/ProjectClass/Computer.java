package ProjectClass;



import ProjectClass.Products;


public class Computer extends Products {

	// Variable for price and quantity of fruits
	private double price;
	private int quantity;

	// Constructor for fruits that will give the price and quantity to the base
	// class
	public Computer(String name, double price, int quantity) {
		super(name);
		this.price = price;
		this.quantity = quantity;
	}

	// Setters and getter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// Return the information of each vegetable
	@Override
	public String toString() {
		return "\nComputer : price= " + price + ", quantity= " + quantity + ", product: " + getName();
	}

}

package ProjectClass;

public class Products {

	// Variable name for the products
	private String name;

	// Constructor for the product of the name
	public Products(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Return the product name
	@Override
	public String toString() {
		return "Produce [name=" + name + "] ";
	}
}

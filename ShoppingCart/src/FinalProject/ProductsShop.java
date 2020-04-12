package FinalProject;

import java.util.Arrays;

import FinalProject.ComputerAccesories;
import FinalProject.Produce;
import FinalProject.Computer;

public class ProductsShop {

	// Variables that contain an array to contain the product and the total of the
	// product, and set the array to zero
	private Produce[] productList;
	private int numProducts;
	private double total;

	// constructor of the truckOfProduce with the array
	public ProductsShop(int size) {
		this.numProducts = 0;
		this.productList = new Produce[size];
	}



	// Method to add new product into the array and to ensure the capacity by
	// calling the ensureCapacity() method
	public void addProduct(Produce listItem) {
		if (numProducts == productList.length) {
			ensureCapacity();
		}
		productList[numProducts] = listItem;
		numProducts++;
	}

	// Search if the product designated in the driver is in the truck, return true
	// if it's in the truck and false if it's not
	public Boolean search(String name) {
		for (int i = 0; i < numProducts; i++) {
			if (productList[i].getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	// Remove the product designated in the driver and return true if it's removed
	// and false if it's not part of the truck
	public Boolean remove(Produce produce) {
		for (int i = 0; i < numProducts; i++) {
			if (productList[i] != null && productList[i].equals(produce)) {
				productList[i] = productList[numProducts-1];
				for (int j = i + 1; j < numProducts; j++) {
					numProducts--;
					return true;
				}
			
			}
		}
		return false;
	}

	// Total of the product multiplied with the price and quantity.
	public double computeTotal() {
		total = 0.0;
		for (int i = 0; i < numProducts; i++) {
			if (productList[i] instanceof ComputerAccesories) {
				ComputerAccesories accesories = (ComputerAccesories) productList[i];
				total = accesories.getQuantity() * accesories.getPrice();
			} else if (productList[i] instanceof Computer) {
				Computer desktop = (Computer) productList[i];
				total = desktop.getQuantity() * desktop.getPrice();
			}
			total += total;
		}
		return total;
	}

	// Method that ensure that the truck can always ensure the capacity and avoid
	// the error message
	public void ensureCapacity() {
		Produce[] produceCapacity;
		produceCapacity = new Produce[(productList.length) * 2];
		for (int i = 0; i < productList.length; i++) {
			produceCapacity[i] = productList[i];
		}
		productList = produceCapacity;
	}

	// Return the arrays of products of the truck
	@Override
	public String toString() {
		return "[produce=" + Arrays.toString(productList) + "\n]";
	}

}

package ProjectClass;

import java.util.Arrays;

import ProjectClass.Computer;
import ProjectClass.ComputerAccesories;
import ProjectClass.Products;

public class ProductsShop {

	private Products[] productList;
	private int numProducts;
	private double total;

	public ProductsShop(int size) {
		this.numProducts = 0;
		this.productList = new Products[size];
	}

	public void addProduct(Products listItem) {
		if (numProducts == productList.length) {
			ensureCapacity();
		}
		productList[numProducts] = listItem;
		numProducts++;
	}

	public Boolean search(String name) {
		for (int i = 0; i < numProducts; i++) {
			if (productList[i].getName().equals(name)) {
				return true;
			}
		}
		return false;
	}

	public Boolean remove(Products produce) {
		for (int i = 0; i < numProducts; i++) {
			if (productList[i] != null && productList[i].equals(produce)) {
				productList[i] = productList[numProducts - 1];
				for (int j = i + 1; j < numProducts; j++) {
					numProducts--;
					return true;
				}

			}
		}
		return false;
	}

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

	public void ensureCapacity() {
		Products[] produceCapacity;
		produceCapacity = new Products[(productList.length) * 2];
		for (int i = 0; i < productList.length; i++) {
			produceCapacity[i] = productList[i];
		}
		productList = produceCapacity;
	}

	@Override
	public String toString() {
		return "[produce=" + Arrays.toString(productList) + "\n]";
	}

}

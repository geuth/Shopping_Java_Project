package ProjectClass;

import java.util.Arrays;

public class AddCustomer {
	private CustomerAccount[] customersList;
	private int numCustomer;
	private double total;

	public AddCustomer(int size) {
		this.numCustomer = 0;
		this.customersList = new CustomerAccount[size];
	}

	public void addCustomer(CustomerAccount listCustomer) {
		if (numCustomer == customersList.length) {
			ensureCapacity();
		}
		customersList[numCustomer] = listCustomer;
		numCustomer++;
	}

	public Boolean search(String name) {
		for (int i = 0; i < numCustomer; i++) {
			if (customersList[i].getFirstName().equals(name)) {
				return true;
			}
		}
		return false;
	}


	public void ensureCapacity() {
		CustomerAccount[] customerCapacity;
		customerCapacity = new CustomerAccount[(customersList.length) * 2];
		for (int i = 0; i < customersList.length; i++) {
			customerCapacity[i] = customersList[i];
		}
		customersList = customerCapacity;
	}

	@Override
	public String toString() {
		return "[produce=" + Arrays.toString(customersList) + "\n]";
	}

}



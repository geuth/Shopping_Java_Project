package FinalProject;

//Final Project Object Oriented Programming
//By Haley Roy 3/24/20

//Customer Class
public class Customer {
	private String firstname;
	private String lastname;
	private String address;

	// Create constructor for the Customer Class.
	public Customer(String firstname, String lastname, String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// Create override methods.
	@Override
	public String toString() {
		String customerInfo = "***Customer Information***" + "\nFrist Name: " + this.firstname + "\nLast Name: "
				+ this.lastname + "\nAddress: " + this.address;
		return customerInfo;
	}
}


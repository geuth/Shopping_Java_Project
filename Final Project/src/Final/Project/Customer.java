package Final.Project;
//Final Project Object Oriented Programming
//By Haley Roy 3/24/20

//Customer Class
public class Customer {
	private String firstname;
	private String lastname;
	private String address;
	private String username;
	private String password;

	// Create constructor for the Customer Class.
	public Customer(String firstname, String lastname, String address) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}

	//Setter for firstname variable.
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	//Setter for lastname variable.
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	//Setter for address variable.
	public void setAddress(String address) {
		this.address = address;
	}
	//Setter for userName variable.
	public void setUsername(String username) {
		this.username = username;
	}
	//Setter for password
	public void setPassword(String password) {
	this.password = password;
	}
	
	
	
	// Create override methods.
	@Override
	public String toString() {
		String customerInfo = "***Customer Information***" + "\nFirst Name: " + this.firstname + "\nLast Name: "
				+ this.lastname + "\nAddress: " + this.address;
		return customerInfo;
	}
}

package ProjectClass;


public class CustomerAccount {
	private String firstName;
	private String lastName;
	private String address;
	CustomerLogin customerLogin;
	
	
	
	public CustomerAccount(String firstName, String lastName, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	public CustomerLogin getCustomerLogin() {
		return customerLogin;
	}
	public void setCustomerLogin(CustomerLogin customerLogin) {
		this.customerLogin = customerLogin;
	}
	
	
	@Override
	public String toString() {
		return "CustomerAccount [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
	
}

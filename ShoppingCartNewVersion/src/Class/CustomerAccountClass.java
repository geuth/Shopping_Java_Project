package Class;



public class CustomerAccountClass {
	private String firstName;
	private String lastName;
	private String address;
	CustomerLogin customerLogin;
	
	public CustomerAccountClass(String firstName, String lastName, String address, CustomerLogin customerLogin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.customerLogin = customerLogin;
	
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
	
	public String infoCustomer() {
		return "First Name : " + firstName + "\nLast Name : "+ lastName+ "\n Address :" + address ;
	}
	
	@Override
	public String toString() {
		return firstName + ","+ lastName+ "," + address+ "," + customerLogin +"\n" ;
	}
	

	
}

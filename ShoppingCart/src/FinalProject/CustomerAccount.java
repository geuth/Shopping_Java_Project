package FinalProject;

public class CustomerAccount {
	private String firstName;
	private String lastName;
	private String address;
	private String username;
	private String password;
	
	
	
	public CustomerAccount(String firstName, String lastName, String address, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.username = username;
		this.password = password;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "CustomerAccount [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
	
}

package Class;

import java.text.DecimalFormat;

public class PersonalCareCategory extends ProductType {
	private double price;
	private int qty;
	private DecimalFormat formatprice = new DecimalFormat("#0.00");
	
	public PersonalCareCategory (String name, double price, int qty) {
		super(name);
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != getClass())
			return false;
		
		PersonalCareCategory  PersonalCareCategory  = (PersonalCareCategory ) obj;
		if (super.equals(obj) && PersonalCareCategory .price == this.price && PersonalCareCategory .qty == this.qty)
			return true;
		
		return false;
	}

	@Override
	public String toString() {
		return super.toString()+"," + qty+ "*" + price + ","+ " the total is : $" + formatprice.format(price*qty);
	}
	
}

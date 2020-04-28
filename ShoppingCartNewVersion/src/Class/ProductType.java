package Class;

public class ProductType{
	private String name;
	private int qty;
	private double price;
	private double totalCost;
	
	public ProductType(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || (obj.getClass() != getClass()))
			return false;
		ProductType ProductType = (ProductType) obj;
		
		return this.name.equalsIgnoreCase(ProductType.name);
		
	}
	
	@Override
	public String toString() {
		return "\n"+name +", " ;
	}
	
	
}

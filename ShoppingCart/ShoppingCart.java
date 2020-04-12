//package FinalProject;
//import java.net.URL;
//public class ShoppingCart {
//	private String itemName;
//	private int itemCost;
//	private int quantity;
//	private URL descriptionURL;
//	
//	
//	public ShoppingCart(String itemName, int itemCost, int quantity, URL descriptionURL) {
//		super();
//		this.itemName = itemName;
//		this.itemCost = itemCost;
//		this.quantity = quantity;
//		this.descriptionURL = descriptionURL;
//	}
//	public String getItemName() {
//		return itemName;
//	}
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
//	public int getItemCost() {
//		return itemCost;
//	}
//	public void setItemCost(int itemCost) {
//		this.itemCost = itemCost;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	public URL getDescriptionURL() {
//		return descriptionURL;
//	}
//	public void setDescriptionURL(URL descriptionURL) {
//		this.descriptionURL = descriptionURL;
//	}
//
//	public void add(ShoppingCart otherItem)
//	{
//		this.quantity = this.quantity + otherItem.quantity;
//	}
//	
//	public void subtract(ShoppingCart otherItem)
//	{
//		this.quantity = this.quantity - otherItem.quantity;
//	}
//	
//	public int hashCode()
//	{
//		return itemName.hashCode() + itemCost;
//	}
//	
//	public boolean equals(Object other)
//	{
//		if (this == other) return true;
//
//		if (!(other instanceof ShoppingCart))
//			return false;
//
//		ShoppingCart otherItem =
//			(ShoppingCart) other;
//
//		return (itemName.equals(otherItem.itemName)) &&
//			(itemCost == otherItem.itemCost);
//	}
//	
//	public ShoppingCart copy()
//	{
//		return new ShoppingCart(itemName, itemCost,
//			quantity, descriptionURL);
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return itemName+" cost: "+itemCost+" qty: "+quantity+" desc: "+
//		descriptionURL;
//	}
//	
//}
//

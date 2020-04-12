package Final.Project;
import java.util.Random;

//Final Project Object Oriented Programming 1082-01
//By Haley Roy 3/25/20

//Order Class
public class Order {
	private static int orderNumber;
	private int orderTotal;
	
	//Created a random number generator that creates a new order number, and saves it to the orderNumber variable.
	public static int numberGenerator (int start, int finish) {
		Random number = new Random();
		int rndmOrderNumber = number.nextInt(finish + 1 - start) + start;
		orderNumber = rndmOrderNumber;
		return orderNumber;
	}
	//Order Class constructor.
	public Order() {
		this.orderNumber = orderNumber;
	}

	//Create getter.
	public static int getOrderNumber() {
		return orderNumber;
	}
	
	//Create a function that will display total from shopping cart
}

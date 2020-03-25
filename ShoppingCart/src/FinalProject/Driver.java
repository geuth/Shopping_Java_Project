package FinalProject;


public class Driver{
		public static void main(String[] args) {
			Order order1 = new Order(1);
			Customer c1 = new Customer("Haley", "Roy", "123 abc road");
			System.out.println(c1.toString());
			System.out.println("Your Order Number is: " + order1.numberGenerator(1,1000));
					
		}
	
}

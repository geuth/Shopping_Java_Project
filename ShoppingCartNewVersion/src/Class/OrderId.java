package Class;

import java.util.ArrayList;
import java.util.Random;

public class OrderId {
		private long orderNum;
		private ArrayList<ProductType> productType;
		
		public OrderId( ArrayList<ProductType> products) {
			super();
			this.orderNum = generateAccountNumber();
			this.productType = products;
		}

		public long getOrderNum() {
			return orderNum;
		}

		public void setOrderNum(long orderNum) {
			this.orderNum = orderNum;
		}
		
		public long generateAccountNumber() {
			return 100000000L + new Random().nextInt(900000000);
		}

		public ArrayList<ProductType> getProductType() {
			return productType;
		}

		public void setProductType(ArrayList<ProductType> productType) {
			this.productType = productType;
		}
		
		@Override
		public String toString() {
			return "Order Number :" + orderNum + ",\n" + productType ;
		}

	
		
}

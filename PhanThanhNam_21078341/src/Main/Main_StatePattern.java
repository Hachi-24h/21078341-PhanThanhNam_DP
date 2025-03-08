package Main;

import StatePattern.OrderContext;

public class Main_StatePattern {
	 public static void main(String[] args) {
	        OrderContext order = new OrderContext();
	        order.process();
	        order.deliver();
	        order.cancel();
	    }
}

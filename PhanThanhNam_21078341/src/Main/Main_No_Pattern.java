package Main;

import No_pattern.Order;

public class Main_No_Pattern {
	public static void main(String[] args) {
		Order order = new Order();
        System.out.println("Initial State: " + order.getStatus());

        order.process();
        System.out.println("After Processing: " + order.getStatus());

        order.deliver();
        System.out.println("After Delivery: " + order.getStatus());

        order.cancel();
        System.out.println("After Cancellation: " + order.getStatus());
	}
}

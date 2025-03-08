package StatePattern;

public class DeliveredOrderState implements OrderState {
    public void process(OrderContext context) { System.out.println("Already delivered."); }
    public void deliver(OrderContext context) { System.out.println("Already delivered."); }
    public void cancel(OrderContext context) { System.out.println("Cannot cancel delivered order."); }
}
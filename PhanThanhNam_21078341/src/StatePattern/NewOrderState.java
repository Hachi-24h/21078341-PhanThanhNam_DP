package StatePattern;

public class NewOrderState implements OrderState {
    public void process(OrderContext context) { context.setState(new ProcessingOrderState()); }
    public void deliver(OrderContext context) { System.out.println("Cannot deliver new order."); }
    public void cancel(OrderContext context) { context.setState(new CancelledOrderState()); }
}

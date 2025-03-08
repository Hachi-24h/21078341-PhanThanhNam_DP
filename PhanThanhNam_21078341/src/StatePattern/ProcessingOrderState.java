package StatePattern;

public class ProcessingOrderState implements OrderState {
    public void process(OrderContext context) { System.out.println("Already processing."); }
    public void deliver(OrderContext context) { context.setState(new DeliveredOrderState()); }
    public void cancel(OrderContext context) { context.setState(new CancelledOrderState()); }
}
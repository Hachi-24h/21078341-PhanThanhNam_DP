package StatePattern;

public class CancelledOrderState implements OrderState {
    public void process(OrderContext context) { System.out.println("Cannot process cancelled order."); }
    public void deliver(OrderContext context) { System.out.println("Cannot deliver cancelled order."); }
    public void cancel(OrderContext context) { System.out.println("Already cancelled."); }
}
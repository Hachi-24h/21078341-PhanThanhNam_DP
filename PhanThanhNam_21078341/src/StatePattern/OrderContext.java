package StatePattern;

//OrderContext.java
public class OrderContext {
 private OrderState state = new NewOrderState();
 
 public void setState(OrderState state) { this.state = state; }
 public void process() { state.process(this); }
 public void deliver() { state.deliver(this); }
 public void cancel() { state.cancel(this); }
}

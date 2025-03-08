package StatePattern;

public interface OrderState {
    void process(OrderContext context);
    void deliver(OrderContext context);
    void cancel(OrderContext context);
}
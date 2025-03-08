package DecoratorPattern;

public class LoggingOrderDecorator implements OrderService {
    private OrderService service;
    
    public LoggingOrderDecorator(OrderService service) { this.service = service; }
    
    public void handle() {
        System.out.println("Logging order process...");
        service.handle();
    }
}
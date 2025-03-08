package DecoratorPattern;

public class BasicOrderService implements OrderService {
    public void handle() { System.out.println("Handling basic order processing..."); }
}
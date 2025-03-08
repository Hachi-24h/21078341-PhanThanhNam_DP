package Main;

import DecoratorPattern.BasicOrderService;
import DecoratorPattern.LoggingOrderDecorator;
import DecoratorPattern.OrderService;

public class Main_DecoratorPatterns {
	public static void main(String[] args) {
        OrderService service = new LoggingOrderDecorator(new BasicOrderService());
        service.handle();
    }
}

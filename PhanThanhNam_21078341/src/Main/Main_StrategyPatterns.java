package Main;

import StrategyPattern.CheckOrderStrategy;
import StrategyPattern.OrderProcessor;
import StrategyPattern.PackOrderStrategy;

public class Main_StrategyPatterns {
	public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        
        processor.setStrategy(new CheckOrderStrategy());
        processor.executeStrategy();
        
        processor.setStrategy(new PackOrderStrategy());
        processor.executeStrategy();
    }
}

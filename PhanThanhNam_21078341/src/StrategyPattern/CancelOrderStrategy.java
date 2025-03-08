package StrategyPattern;

public class CancelOrderStrategy implements OrderStrategy {
    public void execute() { System.out.println("Cancelling order..."); }
}
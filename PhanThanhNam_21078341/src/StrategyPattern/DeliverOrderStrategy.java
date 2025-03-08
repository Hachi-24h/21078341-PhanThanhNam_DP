package StrategyPattern;

public class DeliverOrderStrategy implements OrderStrategy {
    public void execute() { System.out.println("Delivering order..."); }
}
package StrategyPattern;

public class CheckOrderStrategy implements OrderStrategy {
    public void execute() { System.out.println("Checking order info..."); }
}
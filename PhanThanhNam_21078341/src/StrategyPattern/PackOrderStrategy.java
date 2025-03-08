package StrategyPattern;

public class PackOrderStrategy implements OrderStrategy {
    public void execute() { System.out.println("Packing order..."); }
}

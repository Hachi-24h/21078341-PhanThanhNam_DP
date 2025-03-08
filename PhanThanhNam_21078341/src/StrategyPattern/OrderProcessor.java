package StrategyPattern;

public class OrderProcessor {
    private OrderStrategy strategy;
    
    public void setStrategy(OrderStrategy strategy) { this.strategy = strategy; }
    public void executeStrategy() { strategy.execute(); }
}
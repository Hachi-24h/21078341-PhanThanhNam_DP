package Bai01;

public class Main {
    public static void main(String[] args) {

        Stock stock = new Stock();


        Investor investor1 = new ConcreteInvestor("John");
        Investor investor2 = new ConcreteInvestor("Alice");


        stock.addObserver(investor1);
        stock.addObserver(investor2);

        System.out.println("Changing stock price to 100.0");
        stock.setPrice(100.0);

        
        System.out.println("Changing stock price to 120.0");
        stock.setPrice(120.0);
    }
}

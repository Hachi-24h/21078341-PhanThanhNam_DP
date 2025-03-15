package Bai01;

//Concrete Observer
public class ConcreteInvestor implements Investor {
 private String name;

 public ConcreteInvestor(String name) {
     this.name = name;
 }

 @Override
 public void update(double price) {
     System.out.println("Investor " + name + " notified. New stock price: " + price);
 }
}
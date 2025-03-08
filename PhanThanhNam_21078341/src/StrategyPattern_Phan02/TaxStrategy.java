package StrategyPattern_Phan02;

//Interface Strategy cho từng loại thuế
public interface TaxStrategy {
 double calculateTax(double price);
}
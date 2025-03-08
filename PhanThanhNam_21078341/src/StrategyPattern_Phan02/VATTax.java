package StrategyPattern_Phan02;

//VAT Tax (10%)
public class VATTax implements TaxStrategy {
 public double calculateTax(double price) {
     return price * 0.1;
 }
}
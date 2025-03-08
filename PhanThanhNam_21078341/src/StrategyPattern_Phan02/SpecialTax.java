package StrategyPattern_Phan02;

//Thuế tiêu thụ đặc biệt (30%)
public class SpecialTax implements TaxStrategy {
 public double calculateTax(double price) {
     return price * 0.3;
 }
}
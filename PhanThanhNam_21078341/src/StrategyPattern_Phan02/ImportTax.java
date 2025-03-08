package StrategyPattern_Phan02;

//Thuế nhập khẩu (20%)
public class ImportTax implements TaxStrategy {
 public double calculateTax(double price) {
     return price * 0.2;
 }
}
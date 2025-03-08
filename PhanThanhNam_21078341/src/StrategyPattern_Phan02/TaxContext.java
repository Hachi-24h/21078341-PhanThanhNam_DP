package StrategyPattern_Phan02;

//Context để chọn chiến lược thuế
public class TaxContext {
 private TaxStrategy taxStrategy;

 public void setTaxStrategy(TaxStrategy taxStrategy) {
     this.taxStrategy = taxStrategy;
 }

 public double calculateTax(double price) {
     return taxStrategy.calculateTax(price);
 }
}
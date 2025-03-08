package DecoratorPattern_Phan02;

import StrategyPattern_Phan02.TaxStrategy;

//Decorator để kết hợp nhiều loại thuế
public class TaxDecorator implements TaxStrategy {
 private TaxStrategy baseTax;
 private TaxStrategy additionalTax;

 public TaxDecorator(TaxStrategy baseTax, TaxStrategy additionalTax) {
     this.baseTax = baseTax;
     this.additionalTax = additionalTax;
 }

 public double calculateTax(double price) {
     return baseTax.calculateTax(price) + additionalTax.calculateTax(price);
 }
}
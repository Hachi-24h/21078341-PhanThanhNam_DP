package Main_Phan02;

import DecoratorPattern_Phan02.TaxDecorator;
import StrategyPattern_Phan02.ImportTax;
import StrategyPattern_Phan02.TaxContext;
import StrategyPattern_Phan02.VATTax;
import entity.Product;

public class MainDecorator {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);

        TaxContext taxContext = new TaxContext();

        System.out.println("\n--- Kết hợp VAT + Thuế Nhập Khẩu cho Laptop ---");
        taxContext.setTaxStrategy(new TaxDecorator(new VATTax(), new ImportTax()));
        System.out.println("Thuế: " + taxContext.calculateTax(product1.getPrice()));
    }
}
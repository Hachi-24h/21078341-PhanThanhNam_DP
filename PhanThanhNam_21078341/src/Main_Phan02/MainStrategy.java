package Main_Phan02;

import StrategyPattern_Phan02.SpecialTax;
import StrategyPattern_Phan02.TaxContext;
import StrategyPattern_Phan02.VATTax;
import entity.Product;

public class MainStrategy {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Cigar", 500);

        TaxContext taxContext = new TaxContext();

        System.out.println("\n--- Tính thuế VAT cho Laptop ---");
        taxContext.setTaxStrategy(new VATTax());
        System.out.println("Thuế: " + taxContext.calculateTax(product1.getPrice()));

        System.out.println("\n--- Tính thuế Tiêu Thụ Đặc Biệt cho Cigar ---");
        taxContext.setTaxStrategy(new SpecialTax());
        System.out.println("Thuế: " + taxContext.calculateTax(product2.getPrice()));
    }
}
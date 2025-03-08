package Main_Phan02;

import StatePattern_Phan02.HighTaxState;
import StatePattern_Phan02.LowTaxState;
import StatePattern_Phan02.TaxStateContext;
import entity.Product;

public class MainState {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Cigar", 500);

        TaxStateContext stateContext = new TaxStateContext();

        System.out.println("\n--- Laptop có trạng thái thuế thấp ---");
        stateContext.setTaxState(new LowTaxState());
        System.out.println("Thuế: " + stateContext.applyTax(product1.getPrice()));

        System.out.println("\n--- Cigar có trạng thái thuế cao ---");
        stateContext.setTaxState(new HighTaxState());
        System.out.println("Thuế: " + stateContext.applyTax(product2.getPrice()));
    }
}
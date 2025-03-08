package StatePattern_Phan02;

//Trạng thái thuế thấp (chỉ áp dụng VAT)
public class LowTaxState implements TaxState {
 public double applyTax(double price) {
     return price * 0.1; // 10% VAT
 }
}
package StatePattern_Phan02;

//Trạng thái thuế cao (VAT + Thuế tiêu thụ đặc biệt)
public class HighTaxState implements TaxState {
 public double applyTax(double price) {
     return price * 0.1 + price * 0.3; // 10% VAT + 30% Thuế tiêu thụ đặc biệt
 }
}
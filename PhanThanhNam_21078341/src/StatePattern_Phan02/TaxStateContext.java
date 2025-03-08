package StatePattern_Phan02;

public class TaxStateContext {
    private TaxState taxState;

    public void setTaxState(TaxState taxState) {
        this.taxState = taxState;
    }

    public double applyTax(double price) {
        return taxState.applyTax(price);
    }
}
package creational_dp.prototype.example2;

public class PurchaseInvoice extends Invoice {
    private String providerName;

    public PurchaseInvoice() {
        this.type = "PurchaseInvoice";
    }

    @Override
    public void showInvoice() {
        System.out.println("Invoice type: " + this.type);
        System.out.println("Provider name: " + this.providerName);
        System.out.println("Amount: " + this.amount + "\n");
    }

    @Override
    public Invoice clone() {
        PurchaseInvoice invoice = new PurchaseInvoice();
        invoice.providerName = this.providerName;
        invoice.amount = this.amount;
        return invoice;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
}

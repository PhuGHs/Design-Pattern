package creational_dp.prototype.example2;

public class SalesInvoice extends Invoice {
    private String customerName;
    public SalesInvoice() {
        this.type = "SalesInvoice";
    }

    @Override
    public void showInvoice() {
        System.out.println("Invoice type: " + this.type);
        System.out.println("Customer name: " + this.customerName);
        System.out.println("Amount: " + this.amount + "\n");
    }

    @Override
    public Invoice clone() {
        SalesInvoice invoice = new SalesInvoice();
        invoice.amount = this.amount;
        invoice.customerName = this.customerName;
        return invoice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

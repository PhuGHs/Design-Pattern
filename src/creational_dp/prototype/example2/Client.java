package creational_dp.prototype.example2;

public class Client {
    public static void main(String[] args) {
        InvoiceRegistry registry = new InvoiceRegistry();

        //register prototypes
        SalesInvoice salesInvoice = new SalesInvoice();
        salesInvoice.amount = 1000;
        salesInvoice.setCustomerName("Phu");
        registry.registerInvoice("SalesInvoice", salesInvoice);

        PurchaseInvoice purchaseInvoice = new PurchaseInvoice();
        purchaseInvoice.amount = 1000;
        purchaseInvoice.setProviderName("A Provider");
        registry.registerInvoice("PurchaseInvoice", purchaseInvoice);

        //Clone
        Invoice newSalesInvoice = registry.createInvoice("SalesInvoice");
        newSalesInvoice.showInvoice();

        Invoice newPurchaseInvoice = registry.createInvoice("PurchaseInvoice");
        newPurchaseInvoice.showInvoice();
    }
}

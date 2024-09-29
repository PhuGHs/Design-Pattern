package creational_dp.prototype.example2;

import java.util.HashMap;
import java.util.Map;

public class InvoiceRegistry {
    private Map<String, Invoice> registry = new HashMap<>();

    public void registerInvoice(String key, Invoice invoice) {
        registry.put(key, invoice);
    }

    public Invoice createInvoice(String key) {
        Invoice prototype = registry.get(key);
        return prototype != null ? prototype.clone() : null;
    }
}

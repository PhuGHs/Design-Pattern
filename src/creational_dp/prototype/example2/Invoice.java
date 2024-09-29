package creational_dp.prototype.example2;

import java.time.LocalDate;
import java.util.List;

public abstract class Invoice implements ICloneableInvoice {
    protected String type;
    protected double amount;

    public abstract void showInvoice();

    @Override
    public abstract Invoice clone();
}

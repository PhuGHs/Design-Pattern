package structural_dp.decorator.decorator2;

import java.util.List;

public class VuKhi extends LinhDecorator {
    private String vuKhi;

    public VuKhi(ILinh linh, String vuKhi) {
        super(linh);
        this.vuKhi = vuKhi;
    }

    @Override
    public void getItem() {
        super.getItem();
        System.out.println("-------- Vu khi --------------");
        System.out.println("vu khi: " + vuKhi);
    }
}

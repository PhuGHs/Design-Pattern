package structural_dp.decorator.decorator2;

public class QuanHam extends LinhDecorator {
    private String quanHam;

    public QuanHam(ILinh linh, String quanHam) {
        super(linh);
        this.quanHam = quanHam;
    }

    @Override
    public void getItem() {
        super.getItem();
        System.out.println("------------- Quan Ham ----------------");
        System.out.println("QuanHam: " + quanHam);
    }
}

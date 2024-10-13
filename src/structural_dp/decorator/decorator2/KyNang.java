package structural_dp.decorator.decorator2;

public class KyNang extends LinhDecorator {
    private String kyNang;

    public KyNang(ILinh linh, String kyNang) {
        super(linh);
        this.kyNang = kyNang;
    }

    @Override
    public void getItem() {
        System.out.println("---------- Ky Nang ----------------");
        System.out.println(kyNang);
    }
}

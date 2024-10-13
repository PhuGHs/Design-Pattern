package structural_dp.decorator.decorator2;

public class Client {
    public static void main(String[] args) {
        LinhCoBan cb = new LinhCoBan();
        LinhDecorator decorator = new LinhDecorator(cb);
        KyNang kn = new KyNang(decorator, "Nau An");
        VuKhi vk = new VuKhi(kn, "Ao giap");
        VuKhi vk2 = new VuKhi(vk, "Sung");
        QuanHam qh = new QuanHam(vk2, "Nau An");
        qh.getItem();
    }
}

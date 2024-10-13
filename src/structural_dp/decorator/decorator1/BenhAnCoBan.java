package structural_dp.decorator.decorator1;

public class BenhAnCoBan implements IBenhAn {
    private String chanDoanBanDau;

    public BenhAnCoBan(String chanDoanBanDau) {
        this.chanDoanBanDau = chanDoanBanDau;
    }

    @Override
    public void moTa() {
        System.out.println("------------ Benh An Co Ban ----------");
        System.out.println("Chan doan ban dau: " + chanDoanBanDau);
    }
}

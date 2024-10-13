package structural_dp.facade;

public class Client {
    public static void main(String[] args) {
        DonHangFacade fc = new DonHangFacade(new KiemTraTonKho(), new VanChuyen(), new XuLyThanhToan());
        fc.datHang();
    }
}

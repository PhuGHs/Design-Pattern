package structural_dp.facade;

public class DonHangFacade {
    private KiemTraTonKho kiemTraTonKho;
    private VanChuyen vanChuyen;
    private XuLyThanhToan xuLyThanhToan;

    public DonHangFacade(KiemTraTonKho kiemTraTonKho, VanChuyen vanChuyen, XuLyThanhToan xuLyThanhToan) {
        this.kiemTraTonKho = kiemTraTonKho;
        this.vanChuyen = vanChuyen;
        this.xuLyThanhToan = xuLyThanhToan;
    }

    public void datHang() {
        kiemTraTonKho.kiemTraTonKho();
        vanChuyen.vanChuyen();
        xuLyThanhToan.xuLyThanhToan();
    }
}

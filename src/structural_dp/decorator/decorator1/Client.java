package structural_dp.decorator.decorator1;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        BenhAnCoBan coban = new BenhAnCoBan("Chan Doan A");
        KeDonThuoc thuoc = new KeDonThuoc(coban, List.of("Thuoc 1", "Thuoc 2", "Thuoc 3"));
        LieuPhapVatLy vatLy = new LieuPhapVatLy(thuoc, List.of("Lieu Phap 1", "Lieu Phap 2", "Lieu Phap 3"));
        XetNghiemYKhoa xetNghiemYKhoa = new XetNghiemYKhoa(vatLy, List.of("Xet nghiem 1", "Xet nghiem 2", "Xet nghiem 3"));

        xetNghiemYKhoa.moTa();
    }
}

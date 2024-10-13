package structural_dp.decorator.decorator1;

import java.util.List;

public class LieuPhapVatLy extends BenhAnDecorator {
    private List<String> danhSachBuoiTriLieu;

    public LieuPhapVatLy(IBenhAn benhAn, List<String> danhSachBuoiTriLieu) {
        super(benhAn);
        this.danhSachBuoiTriLieu = danhSachBuoiTriLieu;
    }

    @Override
    public void moTa() {
        super.moTa();
        System.out.println("--------- Lieu phap vat ly ---------");
        for (String lieuPhap : danhSachBuoiTriLieu) {
            System.out.println(lieuPhap);
        }
    }
}

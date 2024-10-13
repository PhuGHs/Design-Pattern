package structural_dp.decorator.decorator1;

import java.util.List;

public class KeDonThuoc extends BenhAnDecorator {
    private List<String> danhSachThuoc;
    public KeDonThuoc(IBenhAn benhAn, List<String> danhSachThuoc) {
        super(benhAn);
        this.danhSachThuoc = danhSachThuoc;
    }

    @Override
    public void moTa() {
        super.moTa();
        System.out.println("--------- Ke don thuoc ---------");
        for (String danhSachThuoc : danhSachThuoc) {
            System.out.println(danhSachThuoc);
        }
    }
}

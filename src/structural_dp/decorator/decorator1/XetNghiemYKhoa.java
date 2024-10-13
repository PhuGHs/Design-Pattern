package structural_dp.decorator.decorator1;

import java.util.List;

public class XetNghiemYKhoa extends BenhAnDecorator {
    private List<String> danhSachXetNghiem;

    public XetNghiemYKhoa(IBenhAn benhAn, List<String> danhSachXetNghiem) {
        super(benhAn);
        this.danhSachXetNghiem = danhSachXetNghiem;
    }

    @Override
    public void moTa() {
        super.moTa();
        System.out.println("--------- Xet nghiem y khoa ---------");
        for (String xetNghiem : danhSachXetNghiem) {
            System.out.println(xetNghiem);
        }
    }
}

package structural_dp.bridge.exercise.bridge2.abstractions;

import structural_dp.bridge.exercise.bridge2.implementations.KhoiKienThuc;

import java.util.List;

public class KhoaHocMayTinh extends Nganh {
    public KhoaHocMayTinh(List<KhoiKienThuc> khoiKienThucs, List<ChuyenNganh> chuyenNganhs) {
        super(khoiKienThucs, chuyenNganhs);
    }
}

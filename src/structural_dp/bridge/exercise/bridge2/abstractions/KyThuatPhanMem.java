package structural_dp.bridge.exercise.bridge2.abstractions;

import structural_dp.bridge.exercise.bridge2.implementations.KhoiKienThuc;

import java.util.List;

public class KyThuatPhanMem extends Nganh {
    public KyThuatPhanMem(List<KhoiKienThuc> khoiKienThucs, List<ChuyenNganh> chuyenNganhs) {
        super(khoiKienThucs, chuyenNganhs);
    }
}

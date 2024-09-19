package structural_dp.bridge.exercise.bridge2.abstractions;

import structural_dp.bridge.exercise.bridge2.implementations.KhoiKienThuc;

import java.util.List;

public abstract class Nganh {
    protected List<KhoiKienThuc> khoiKienThucs;
    protected List<ChuyenNganh> chuyenNganhs;

    public Nganh(List<KhoiKienThuc> khoiKienThucs, List<ChuyenNganh> chuyenNganhs) {
        this.khoiKienThucs = khoiKienThucs;
        this.chuyenNganhs = chuyenNganhs;
    }
}

package structural_dp.bridge.exercise.bridge2;

import structural_dp.bridge.exercise.bridge2.abstractions.ChuyenNganh;
import structural_dp.bridge.exercise.bridge2.abstractions.KhoaHocMayTinh;
import structural_dp.bridge.exercise.bridge2.implementations.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Subject> daiCuongs = new ArrayList<Subject>();
        daiCuongs.add(new Subject("Giai Tich", 4));
        daiCuongs.add(new Subject("Dai So Tuyen Tinh", 3));
        daiCuongs.add(new Subject("Gioi thieu nganh", 1));

        List<Subject> coSoNganhs = new ArrayList<>();
        coSoNganhs.add(new Subject("He Dieu Hanh", 4));
        coSoNganhs.add(new Subject("Nhap mon lap trinh", 4));
        coSoNganhs.add(new Subject("Co so Du lieu", 4));
        coSoNganhs.add(new Subject("Nhap mon mang may tinh", 4));

        List<Subject> chuyenNganhs = new ArrayList<>();
        chuyenNganhs.add(new Subject("Mang xa hoi", 4));
        chuyenNganhs.add(new Subject("Chuyen de du lieu nang cao", 4));

        List<Subject> tuDos = new ArrayList<>();
        tuDos.add(new Subject("Tu dos", 4));
        tuDos.add(new Subject("Tu dos", 4));
        tuDos.add(new Subject("Tu dos", 4));

        List<Subject> totNghieps = new ArrayList<>();
        totNghieps.add(new Subject("Tu dos", 4));
        totNghieps.add(new Subject("Tu dos", 4));

        List<ChuyenNganh> cns = new ArrayList<>();
        cns.add(new ChuyenNganh("goal 1", chuyenNganhs));
        cns.add(new ChuyenNganh("goal 2", chuyenNganhs));
        cns.add(new ChuyenNganh("goal 3", chuyenNganhs));

        KhoiDaiCuong daiCuong = new KhoiDaiCuong(daiCuongs, 20);
        KhoiCoSoNganh coSoNganh = new KhoiCoSoNganh(coSoNganhs, 20);
        KhoiTuChon tuChon = new KhoiTuChon(tuDos, 20);
        KhoiChuyenNganh chuyenNganh = new KhoiChuyenNganh(chuyenNganhs, 20);
        KhoaLuan kl = new KhoaLuan(totNghieps, 20);
        ChuyenDeTotNghiep cdtn = new ChuyenDeTotNghiep(totNghieps, 20);


        List<KhoiKienThuc> kts = new ArrayList<>();
        kts.add(daiCuong);
        kts.add(coSoNganh);
        kts.add(tuChon);
        kts.add(chuyenNganh);
        kts.add(cdtn);
        KhoaHocMayTinh khmt = new KhoaHocMayTinh(kts, cns);
        for (KhoiKienThuc k : kts) {
            k.printField();
        }
    }
}

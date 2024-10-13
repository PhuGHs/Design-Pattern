package structural_dp.decorator.decorator2;

import java.util.List;

public class LinhCoBan implements ILinh {
    private List<String> quanTrangs = List.of("Giay", "Ao", "Mu coi");

    @Override
    public void getItem() {
        System.out.println("------ Quan Trang ------");
        for (String quanTrang : quanTrangs) {
            System.out.println(quanTrang);
        }
    }
}

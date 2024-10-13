package structural_dp.decorator.decorator1;

public class BenhAnDecorator implements IBenhAn {
    private IBenhAn benhAn;

    public BenhAnDecorator(IBenhAn benhAn) {
        this.benhAn = benhAn;
    }

    @Override
    public void moTa() {
        benhAn.moTa();
    }
}

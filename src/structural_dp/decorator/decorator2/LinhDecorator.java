package structural_dp.decorator.decorator2;

public class LinhDecorator implements ILinh {
    private ILinh linh;

    public LinhDecorator(ILinh linh) {
        this.linh = linh;
    }

    @Override
    public void getItem() {
        linh.getItem();
    }
}

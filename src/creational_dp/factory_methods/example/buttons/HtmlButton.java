package creational_dp.factory_methods.example.buttons;

//concrete product
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("render HtmlButton");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("onClick HtmlButton");
    }
}

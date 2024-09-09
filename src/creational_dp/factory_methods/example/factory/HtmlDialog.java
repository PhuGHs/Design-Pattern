package creational_dp.factory_methods.example.factory;

import creational_dp.factory_methods.example.buttons.Button;
import creational_dp.factory_methods.example.buttons.HtmlButton;

//concrete creator
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

package creational_dp.factory_methods.example.factory;

import creational_dp.factory_methods.example.buttons.Button;
import creational_dp.factory_methods.example.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

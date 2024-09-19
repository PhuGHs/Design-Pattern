package creational_dp.factory_methods.example.factory;

import creational_dp.factory_methods.example.buttons.Button;

//creator
public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

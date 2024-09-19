package creational_dp.factory_methods.example;

import creational_dp.factory_methods.example.factory.Dialog;
import creational_dp.factory_methods.example.factory.HtmlDialog;
import creational_dp.factory_methods.example.factory.WindowsDialog;

public class Client {
    private static Dialog dialog;
    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

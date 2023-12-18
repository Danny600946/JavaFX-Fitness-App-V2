module com.fitness.StartUpUI {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports StartUpUI;
    opens StartUpUI to javafx.fxml;

    exports CustomActionListeners;
    opens CustomActionListeners to javafx.fxml;
}
package StartUpUI;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class StartUp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        CustomStage customStage = new CustomStage();
        customStage.show();
    }
    // Launches the UI
    public static void main(String[] args) {
        Application.setUserAgentStylesheet(null);
        launch(args);
    }
}
package StartUpUI;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginScene extends Scene {
    public LoginScene(BorderPane root, Stage stage) {
        super(root);
        getStylesheets().add("HomeSceneCSS.css");
        root.setId("root");
        root.setTop(new NavBar(stage, ActivateButton.SIGN_UP));
        root.setCenter(new LoginForm(stage));
    }
}

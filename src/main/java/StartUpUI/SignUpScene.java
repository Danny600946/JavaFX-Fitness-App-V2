package StartUpUI;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SignUpScene extends Scene {

    public SignUpScene(BorderPane root, Stage stage) {
        super(root);
        getStylesheets().add("HomeSceneCSS.css");
        root.setId("root");
        root.setMaxWidth(stage.getWidth());
        root.setTop(new NavBar(stage, ActivateButton.LOGIN));
        root.setCenter(new SignUpForm(stage));
    }
}

package StartUpUI;

import javafx.animation.ScaleTransition;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomeScene extends Scene {
    public HomeScene(BorderPane root, Stage stage) {
        super(root);
        getStylesheets().add("HomeSceneCSS.css");
        root.setId("root");
        StackPane homeStack = new StackPane();
        Ellipse oval = new Ellipse(150, 150, 300, 150);
        oval.setId("oval");

        homeStack.getChildren().add(oval);
        homeStack.getChildren().add(new HomeNav(stage));

        root.setCenter(homeStack);
    }
}

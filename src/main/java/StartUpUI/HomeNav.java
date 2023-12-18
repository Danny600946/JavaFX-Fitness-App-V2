package StartUpUI;

import CustomActionListeners.NavLoginActionListener;
import CustomActionListeners.NavSignUpActionListener;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class HomeNav extends GridPane {

    private Image image = new Image("GetFitLogo.png");
    private ImageView getFitLogo = new ImageView(image);
    private Button homeNavLogin = new Button("Login");
    private Button homeNavSignUp = new Button("Sign Up");

    public HomeNav(Stage stage) {
        setHgap(20);
        setVgap(15);

        getFitLogo.setPreserveRatio(true);
        getFitLogo.setFitHeight(100);

        homeNavLogin.getStyleClass().add("default-button");
        homeNavLogin.setOnAction(new NavLoginActionListener(stage));

        homeNavSignUp.getStyleClass().add("default-button");
        homeNavSignUp.setOnAction(new NavSignUpActionListener(stage));

        add(getFitLogo, 0, 0, 7, 1);
        add(homeNavLogin, 2, 1);
        add(homeNavSignUp, 4, 1);

        setAlignment(Pos.CENTER);
    }
}

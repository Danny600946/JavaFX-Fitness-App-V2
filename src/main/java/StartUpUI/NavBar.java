package StartUpUI;

import CustomActionListeners.NavLoginActionListener;
import CustomActionListeners.NavSignUpActionListener;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class NavBar extends HBox {

    public NavBar(Stage stage, ActivateButton whichButton){
        getStylesheets().add("HomeSceneCSS.css");

        setId("login-signup-navbar");
        setAlignment(Pos.CENTER);

        Image image = new Image("GetFitLogo.png");
        ImageView getFitLogo = new ImageView(image);
        getFitLogo.setPreserveRatio(true);
        getFitLogo.setFitHeight(80);

        Region filler = new Region();
        setHgrow(filler, Priority.ALWAYS);

        Button navLogin = new Button("Login");
        navLogin.getStyleClass().add("default-button");

        Button navSignUp = new Button("Sign Up");
        navSignUp.getStyleClass().add("default-button");

        if(whichButton == ActivateButton.LOGIN){navLogin.setOnAction(new NavLoginActionListener(stage));}

        else{navSignUp.setOnAction(new NavSignUpActionListener(stage));}

        getChildren().addAll(getFitLogo, filler, navLogin, navSignUp);


    }
}

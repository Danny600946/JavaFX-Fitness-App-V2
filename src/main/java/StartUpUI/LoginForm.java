package StartUpUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginForm extends VBox {

    public LoginForm(Stage stage){
        setMaxWidth(200);
        setAlignment(Pos.CENTER);

        Label loginLabel = new Label("Login");
        loginLabel.getStyleClass().add("login-label");
        Label usernameLabel = new Label("Username");
        usernameLabel.getStyleClass().add("login-sub-label");
        Label passwordLabel = new Label("Password");
        passwordLabel.getStyleClass().add("login-sub-label");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter Username");
        usernameField.setMaxHeight(40);
        usernameField.setMinHeight(40);
        usernameField.getStyleClass().add("login-text-field");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setMaxHeight(40);
        passwordField.setMinHeight(40);
        passwordField.getStyleClass().add("login-text-field");

        Button loginButton = new Button("Login");

        // The new Label() is to provide a gap above the login button. There is no JavaFX CSS margin attribute.
        getChildren().addAll(loginLabel, usernameLabel, usernameField, passwordLabel, passwordField, new Label (),
                loginButton);


    }
}

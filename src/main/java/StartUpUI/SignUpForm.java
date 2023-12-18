package StartUpUI;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class SignUpForm extends VBox {
    public SignUpForm(Stage stage){
        setMaxWidth(200);
        setAlignment(Pos.CENTER);


        Label signUpLabel = new Label("Sign Up");
        signUpLabel.getStyleClass().add("login-label");

        Label usernameLabel = new Label("Username");
        usernameLabel.getStyleClass().add("login-sub-label");
        TextField usernameTextField = new TextField();
        usernameTextField.setPromptText("Enter Username");
        usernameTextField.setMaxHeight(40);
        usernameTextField.setMinHeight(40);
        usernameTextField.getStyleClass().add("login-text-field");

        Label emailLabel = new Label("Email");
        emailLabel.getStyleClass().add("login-sub-label");
        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter Email");
        emailTextField.setMaxHeight(40);
        emailTextField.setMinHeight(40);
        emailTextField.getStyleClass().add("login-text-field");

        Label passwordLabel = new Label("Password");
        passwordLabel.getStyleClass().add("login-sub-label");
        PasswordField passwordTextField = new PasswordField();
        passwordTextField.setPromptText("Enter Password");
        passwordTextField.setMaxHeight(40);
        passwordTextField.setMinHeight(40);
        passwordTextField.getStyleClass().add("login-text-field");

        Label confirmPasswordLabel = new Label("Confirm Password");
        confirmPasswordLabel.getStyleClass().add("login-sub-label");
        PasswordField confirmPasswordTextField = new PasswordField();
        confirmPasswordTextField.setPromptText("Enter Password");
        confirmPasswordTextField.setMaxHeight(40);
        confirmPasswordTextField.setMinHeight(40);
        confirmPasswordTextField.getStyleClass().add("login-text-field");

        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("default-button");

        getChildren().addAll(signUpLabel, usernameLabel, usernameTextField, emailLabel, emailTextField, passwordLabel,
                passwordTextField, confirmPasswordLabel, confirmPasswordTextField, new Label(), signUpButton);

    }
}

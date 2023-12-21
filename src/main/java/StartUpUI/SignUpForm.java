package StartUpUI;

import DataManagement.UserInfo;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class SignUpForm extends GridPane {
    public SignUpForm(Stage stage){
        setMaxWidth(200);
        setAlignment(Pos.CENTER);
        setHgap(5);
        setGridLinesVisible(true);

        ColumnConstraints allCols = new ColumnConstraints(200);
        getColumnConstraints().addAll(allCols, allCols);

        RowConstraints mainLabelRows = new RowConstraints(70);
        RowConstraints subLabelRows = new RowConstraints(20);
        RowConstraints fieldRows = new RowConstraints(50);
        RowConstraints buttonRows = new RowConstraints(50);
        getRowConstraints().addAll(mainLabelRows, subLabelRows, fieldRows, subLabelRows, fieldRows, subLabelRows,
                fieldRows, subLabelRows, fieldRows, buttonRows);

        Label signUpLabel = new Label("Sign Up");
        signUpLabel.getStyleClass().add("login-label");
        add(signUpLabel, 0,0);
        GridPane.setColumnSpan(signUpLabel,2);
        GridPane.setHalignment(signUpLabel, HPos.CENTER);

        Label usernameLabel = new Label("Username");
        usernameLabel.getStyleClass().add("login-sub-label");
        add(usernameLabel, 0,1);
        GridPane.setColumnSpan(usernameLabel,2);
        GridPane.setHalignment(usernameLabel, HPos.CENTER);

        Text usernameValidationText = new Text("At Least 6 Characters");
        Text usernameValidationText2 = new Text("No Spaces Or Semicolons");

        TextField usernameTextField = new TextField();
        usernameTextField.setPromptText("Enter Username");
        usernameTextField.setMaxHeight(40);
        usernameTextField.setMinHeight(40);
        usernameTextField.getStyleClass().add("login-text-field");
        usernameTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            UserInfo.validateUsername(newValue, usernameValidationText, usernameValidationText2);

        });
        add(usernameTextField, 0,2);

        ValidationMessages usernameValidationMessages = new ValidationMessages(usernameValidationText, usernameValidationText2);
        setMargin(usernameValidationMessages, new Insets(5));
        add(usernameValidationMessages, 1,2);
        GridPane.setHalignment(usernameValidationMessages, HPos.CENTER);

        Label emailLabel = new Label("Email");
        emailLabel.getStyleClass().add("login-sub-label");
        add(emailLabel, 0,3);
        GridPane.setColumnSpan(emailLabel,2);
        GridPane.setHalignment(emailLabel, HPos.CENTER);

        TextField emailTextField = new TextField();
        emailTextField.setPromptText("Enter Email");
        emailTextField.setMaxHeight(40);
        emailTextField.setMinHeight(40);
        emailTextField.getStyleClass().add("login-text-field");
        add(emailTextField, 0,4);

        Label passwordLabel = new Label("Password");
        passwordLabel.getStyleClass().add("login-sub-label");
        add(passwordLabel, 0,5);
        GridPane.setColumnSpan(passwordLabel,2);
        GridPane.setHalignment(passwordLabel, HPos.CENTER);

        PasswordField passwordTextField = new PasswordField();
        passwordTextField.setPromptText("Enter Password");
        passwordTextField.setMaxHeight(40);
        passwordTextField.setMinHeight(40);
        passwordTextField.getStyleClass().add("login-text-field");
        add(passwordTextField, 0,6);

        Label confirmPasswordLabel = new Label("Confirm Password");
        confirmPasswordLabel.getStyleClass().add("login-sub-label");
        add(confirmPasswordLabel, 0,7);
        GridPane.setColumnSpan(confirmPasswordLabel,2);
        GridPane.setHalignment(confirmPasswordLabel, HPos.CENTER);

        PasswordField confirmPasswordTextField = new PasswordField();
        confirmPasswordTextField.setPromptText("Enter Password");
        confirmPasswordTextField.setMaxHeight(40);
        confirmPasswordTextField.setMinHeight(40);
        confirmPasswordTextField.getStyleClass().add("login-text-field");
        add(confirmPasswordTextField, 0,8);

        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("default-button");
        add(signUpButton, 0,9);
        GridPane.setHalignment(signUpButton, HPos.CENTER);
        GridPane.setColumnSpan(signUpButton,2);



    }
}

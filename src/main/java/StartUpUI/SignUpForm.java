package StartUpUI;

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

    private TextField usernameTextField = new TextField();
    private Text usernameValidationText = new Text("At Least 6 Characters");
    private Text usernameValidationText2 = new Text("No Spaces");
    private TextField emailTextField = new TextField();
    private Label emailValidationLabel = new Label();
    private PasswordField passwordTextField = new PasswordField();
    private Label passwordValidationLabel = new Label();
    private PasswordField confirmPasswordTextField = new PasswordField();
    private Label confirmPasswordValidationLabel = new Label();
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
        usernameTextField.setPromptText("Enter Username");
        usernameTextField.setMaxHeight(40);
        usernameTextField.setMinHeight(40);
        usernameTextField.getStyleClass().add("login-text-field");
        add(usernameLabel, 0,1);
        GridPane.setColumnSpan(usernameLabel,2);
        GridPane.setHalignment(usernameLabel, HPos.CENTER);
        add(usernameTextField, 0,2);

        ValidationMessages usernameValidationMessages = new ValidationMessages(usernameValidationText, usernameValidationText2);
        setMargin(usernameValidationMessages, new Insets(5));
        add(usernameValidationMessages, 1,2);
        GridPane.setHalignment(usernameValidationMessages, HPos.CENTER);

        Label emailLabel = new Label("Email");
        emailLabel.getStyleClass().add("login-sub-label");
        emailTextField.setPromptText("Enter Email");
        emailTextField.setMaxHeight(40);
        emailTextField.setMinHeight(40);
        emailTextField.getStyleClass().add("login-text-field");
        add(emailLabel, 0,3);
        GridPane.setColumnSpan(emailLabel,2);
        GridPane.setHalignment(emailLabel, HPos.CENTER);
        add(emailTextField, 0,4);

        Label passwordLabel = new Label("Password");
        passwordLabel.getStyleClass().add("login-sub-label");
        passwordTextField.setPromptText("Enter Password");
        passwordTextField.setMaxHeight(40);
        passwordTextField.setMinHeight(40);
        passwordTextField.getStyleClass().add("login-text-field");
        add(passwordLabel, 0,5);
        GridPane.setColumnSpan(passwordLabel,2);
        GridPane.setHalignment(passwordLabel, HPos.CENTER);
        add(passwordTextField, 0,6);

        Label confirmPasswordLabel = new Label("Confirm Password");
        confirmPasswordLabel.getStyleClass().add("login-sub-label");
        confirmPasswordTextField.setPromptText("Enter Password");
        confirmPasswordTextField.setMaxHeight(40);
        confirmPasswordTextField.setMinHeight(40);
        confirmPasswordTextField.getStyleClass().add("login-text-field");
        add(confirmPasswordLabel, 0,7);
        GridPane.setColumnSpan(confirmPasswordLabel,2);
        GridPane.setHalignment(confirmPasswordLabel, HPos.CENTER);
        add(confirmPasswordTextField, 0,8);

        Button signUpButton = new Button("Sign Up");
        signUpButton.getStyleClass().add("default-button");
        add(signUpButton, 0,9);
        GridPane.setHalignment(signUpButton, HPos.CENTER);
        GridPane.setColumnSpan(signUpButton,2);



    }
}

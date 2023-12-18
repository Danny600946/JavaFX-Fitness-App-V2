package CustomActionListeners;

import StartUpUI.SignUpScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NavSignUpActionListener implements EventHandler<ActionEvent> {

    private final Stage stage;

    public NavSignUpActionListener(Stage stage){
        this.stage = stage;
    }
    @Override
    public void handle(ActionEvent event) {
        stage.setScene(new SignUpScene(new BorderPane(),stage));
    }
}

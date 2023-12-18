package CustomActionListeners;

import StartUpUI.LoginScene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class NavLoginActionListener implements EventHandler<ActionEvent> {

    private final Stage stage;

    public NavLoginActionListener(Stage stage){
        this.stage = stage;
    }
    @Override
    public void handle(ActionEvent event) {
        stage.setScene(new LoginScene(new BorderPane(), stage));
    }
}

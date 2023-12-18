package StartUpUI;

import javafx.geometry.Rectangle2D;
import javafx.scene.layout.BorderPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class CustomStage extends Stage {

    public CustomStage(){
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        double screenWidth = bounds.getWidth();
        double screenHeight = bounds.getHeight();

        setWidth(screenWidth /2);
        setHeight(screenHeight /1.5);

        System.out.println(this.getHeight());
        setScene(new HomeScene(new BorderPane(), this));
    }
}

package StartUpUI;

import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ValidationMessages extends VBox {
    public ValidationMessages(Text... validationTexts){
        getStyleClass().add("validation-texts");
        setMaxHeight(40);
        setMinHeight(40);
        setAlignment(Pos.CENTER);
        getChildren().addAll(validationTexts);
    }
}

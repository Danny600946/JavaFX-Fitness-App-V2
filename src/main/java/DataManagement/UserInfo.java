package DataManagement;

import javafx.scene.text.Text;

public class UserInfo {

    public static boolean validateUsername(String username, Text usernameLengthText, Text usernameSemicolonSpaceText) {
        usernameLengthText.getStyleClass().clear();
        usernameSemicolonSpaceText.getStyleClass().clear();
        boolean validLength = false;
        boolean validChars = false;

        if (username.length() < 6){
            usernameLengthText.getStyleClass().add("not-valid-message");
        }
        else{
            usernameLengthText.getStyleClass().add("valid-message");
            validLength = true;
        }

        if(username.contains(";") || username.contains(" ")){
            usernameSemicolonSpaceText.getStyleClass().add("not-valid-message");
        }
        else {
            usernameSemicolonSpaceText.getStyleClass().add("valid-message");
            validChars = true;
        }

        return validLength && validChars;
    }

}

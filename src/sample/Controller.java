package sample;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


import java.util.Optional;


public class Controller{
    @FXML
    private Button newgame_btn;
    @FXML
    private Button exitgame_btn;
    public boolean inProgress=false;

    public void startGame(){
        if(inProgress==true){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Restart game");
            alert.setHeaderText("You're going to restart game.");
            alert.setContentText("All your game progress will be lost. Are you sure?");
            Optional<ButtonType> result = alert.showAndWait();
            if ((result.get() == ButtonType.OK) && inProgress == true) {
                System.out.println("Game restarted!");
                newgame_btn.setText("New game");
            } else {
                System.out.println("Game not restarted!");
            }
        }
        else if(inProgress==false){
            newgame_btn.setDisable(true);
            newgame_btn.setText("Restart");
            System.out.println("Game started!");
            inProgress=true;
        }
    }
    public void exitGame(){
        if(inProgress==true) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit game");
            alert.setHeaderText("You're going to leave game.");
            alert.setContentText("All your game progress will be lost. Are you sure?");
            Optional<ButtonType> result = alert.showAndWait();
            if ((result.get() == ButtonType.OK) && inProgress == true) {
                Platform.exit();
            } else {
                // ... user chose CANCEL or closed the dialog
            }
        }
        else{
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit game");
            alert.setHeaderText("You're going to leave game.");
            alert.setContentText("Are you sure?");
            Optional<ButtonType> result = alert.showAndWait();
            if ((result.get() == ButtonType.OK)) {
                Platform.exit();
            } else {
                // ... user chose CANCEL or closed the dialog
            }
        }
    }
}

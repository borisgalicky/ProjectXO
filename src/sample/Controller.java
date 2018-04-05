package sample;
import javafx.event.ActionEvent;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.Random;
import java.util.Optional;


public class Controller{
    @FXML
    public Button newgame_btn;
    @FXML
    public Button exitgame_btn;
    @FXML
    public ImageView img1;
    @FXML
    public ImageView img2;
    @FXML
    public ImageView img3;
    @FXML
    public ImageView img4;
    @FXML
    public ImageView img5;
    @FXML
    public ImageView img6;
    @FXML
    public ImageView img7;
    @FXML
    public ImageView img8;
    @FXML
    public ImageView img9;
    @FXML
    public ImageView img10;
    @FXML
    public ImageView img11;
    @FXML
    public ImageView img12;
    @FXML
    public ImageView img13;
    @FXML
    public ImageView img14;
    @FXML
    public ImageView img15;
    @FXML
    public ImageView img16;
    @FXML
    public Label counter;
    private boolean inProgress=false;
    private int[][]arr=new int[4][4];
    private int clicks=0;

    public void startGame(){
        if(inProgress==true){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Restart game");
            alert.setHeaderText("You're going to restart game.");
            alert.setContentText("All your game progress will be lost. Are you sure?");
            Optional<ButtonType> result = alert.showAndWait();
            if((result.get()==ButtonType.OK)&&inProgress == true){
                newgame_btn.setDisable(true);
                counter.setText("0");
                clicks=0;
                Random rn=new Random();
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        int answer=rn.nextInt(2)+0;
                        arr[i][j]=answer;
                    }
                }
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        System.out.print(arr[i][j]+"  ");
                    }
                    System.out.println("\n");
                }
            }else{
                //nothing
            }
        }
        else if(inProgress==false){
            Random rn=new Random();
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    int answer=rn.nextInt(2)+0;
                    arr[i][j]=answer;
                }
            }
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println("\n");
            }
            newgame_btn.setDisable(true);
            newgame_btn.setText("Restart");
            inProgress=true;
        }
    }
    public void processGame(javafx.scene.input.MouseEvent mouseEvent){
        if(inProgress==true) {
            if(mouseEvent.getSource() == img1){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img2){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img3){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img4){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img5){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img6){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img7){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img8){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img9){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img10){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img11){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img12){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img13){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img14){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img15){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
            if(mouseEvent.getSource() == img16){
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                arr[0][0]=0;arr[0][1]=1;arr[1][0]=1;arr[1][1]=1;
            }
        }
    }
    public void exitGame(){
        if(inProgress==true){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit game");
            alert.setHeaderText("You're going to leave game.");
            alert.setContentText("All your game progress will be lost. Are you sure?");
            Optional<ButtonType> result = alert.showAndWait();
            if((result.get()==ButtonType.OK)&&inProgress == true){
                Platform.exit();
            }else{
                //nothing
            }
        }
        else{
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit game");
            alert.setHeaderText("You're going to leave game.");
            alert.setContentText("Are you sure?");
            Optional<ButtonType> result = alert.showAndWait();
            if((result.get()==ButtonType.OK)){
                Platform.exit();
            }else{
                //nothing
            }
        }
    }


}

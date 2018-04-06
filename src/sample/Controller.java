package sample;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.io.FileInputStream;
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
    @FXML
    public GridPane gridpane;
    @FXML
    public Label winner;
    private boolean inProgress=false;
    private int[][]arr=new int[4][4];
    private int clicks=0;

    public void startGame()throws Exception{
        String current=new java.io.File(".").getCanonicalPath();
        Image imageX=new Image(new FileInputStream(current+"\\src\\resource\\X.png"));
        Image imageO=new Image(new FileInputStream(current+"\\src\\resource\\O.png"));
        if(inProgress==true){
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Restart game");
            alert.setHeaderText("You're going to restart game.");
            alert.setContentText("All your game progress will be lost. Are you sure?");
            Optional<ButtonType> result=alert.showAndWait();
            if((result.get()==ButtonType.OK)){
                newgame_btn.setDisable(true);
                counter.setText("0");
                clicks=0;
                Random rn=new Random();
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        int answer=rn.nextInt(2);
                        arr[i][j]=answer;
                    }
                }int count=1;
                for(int i=0;i<4;i++){
                    for(int j=0;j<4;j++){
                        if(arr[i][j]==0){
                            switch(count){
                                case 1:img1.setImage(imageO);
                                case 2:img2.setImage(imageO);
                                case 3:img3.setImage(imageO);
                                case 4:img4.setImage(imageO);
                                case 5:img5.setImage(imageO);
                                case 6:img6.setImage(imageO);
                                case 7:img7.setImage(imageO);
                                case 8:img8.setImage(imageO);
                                case 9:img9.setImage(imageO);
                                case 10:img10.setImage(imageO);
                                case 11:img11.setImage(imageO);
                                case 12:img12.setImage(imageO);
                                case 13:img13.setImage(imageO);
                                case 14:img14.setImage(imageO);
                                case 15:img15.setImage(imageO);
                                case 16:img16.setImage(imageO);
                            }
                            count++;
                        }
                        else{
                            switch(count){
                                case 1:img1.setImage(imageX);
                                case 2:img2.setImage(imageX);
                                case 3:img3.setImage(imageX);
                                case 4:img4.setImage(imageX);
                                case 5:img5.setImage(imageX);
                                case 6:img6.setImage(imageX);
                                case 7:img7.setImage(imageX);
                                case 8:img8.setImage(imageX);
                                case 9:img9.setImage(imageX);
                                case 10:img10.setImage(imageX);
                                case 11:img11.setImage(imageX);
                                case 12:img12.setImage(imageX);
                                case 13:img13.setImage(imageX);
                                case 14:img14.setImage(imageX);
                                case 15:img15.setImage(imageX);
                                case 16:img16.setImage(imageX);
                            }
                            count++;
                        }
                    }
                }
            }else{
                //nothing
            }
        }
        else if(inProgress==false){
            winner.setText("");
            counter.setText("0");
            Random rn = new Random();
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    int answer = rn.nextInt(2);
                    arr[i][j] = answer;
                }
            }int count=1;
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    if(arr[i][j]==0){
                        switch(count){
                            case 1:img1.setImage(imageO);
                            case 2:img2.setImage(imageO);
                            case 3:img3.setImage(imageO);
                            case 4:img4.setImage(imageO);
                            case 5:img5.setImage(imageO);
                            case 6:img6.setImage(imageO);
                            case 7:img7.setImage(imageO);
                            case 8:img8.setImage(imageO);
                            case 9:img9.setImage(imageO);
                            case 10:img10.setImage(imageO);
                            case 11:img11.setImage(imageO);
                            case 12:img12.setImage(imageO);
                            case 13:img13.setImage(imageO);
                            case 14:img14.setImage(imageO);
                            case 15:img15.setImage(imageO);
                            case 16:img16.setImage(imageO);
                        }
                        count++;
                    }
                    else{
                        switch(count){
                            case 1:img1.setImage(imageX);
                            case 2:img2.setImage(imageX);
                            case 3:img3.setImage(imageX);
                            case 4:img4.setImage(imageX);
                            case 5:img5.setImage(imageX);
                            case 6:img6.setImage(imageX);
                            case 7:img7.setImage(imageX);
                            case 8:img8.setImage(imageX);
                            case 9:img9.setImage(imageX);
                            case 10:img10.setImage(imageX);
                            case 11:img11.setImage(imageX);
                            case 12:img12.setImage(imageX);
                            case 13:img13.setImage(imageX);
                            case 14:img14.setImage(imageX);
                            case 15:img15.setImage(imageX);
                            case 16:img16.setImage(imageX);
                        }
                        count++;
                    }
                }
            }
            newgame_btn.setDisable(true);
            newgame_btn.setText("Restart");
            inProgress=true;
            gridpane.setDisable(false);
        }
    }
    public void processGame(MouseEvent mouseEvent)throws Exception{
        String current=new java.io.File(".").getCanonicalPath();
        Image imageX=new Image(new FileInputStream(current+"\\src\\resource\\X.png"));
        Image imageO=new Image(new FileInputStream(current+"\\src\\resource\\O.png"));
        if(inProgress==true){
            if (mouseEvent.getSource() == img1) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][1]==1){arr[0][1]=0;img2.setImage(imageO);}else{arr[0][1]=1;img2.setImage(imageX);}
                if(arr[1][0]==1){arr[1][0]=0;img5.setImage(imageO);}else{arr[1][0]=1;img5.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
            } else if (mouseEvent.getSource() == img2) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][0]==1){arr[0][0]=0;img1.setImage(imageO);}else{arr[0][0]=1;img1.setImage(imageX);}
                if(arr[1][0]==1){arr[1][0]=0;img5.setImage(imageO);}else{arr[1][0]=1;img5.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[0][2]==1){arr[0][2]=0;img3.setImage(imageO);}else{arr[0][2]=1;img3.setImage(imageX);}
            } else if (mouseEvent.getSource() == img3) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][1]==1){arr[0][1]=0;img2.setImage(imageO);}else{arr[0][1]=1;img2.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[1][3]==1){arr[1][3]=0;img8.setImage(imageO);}else{arr[1][3]=1;img8.setImage(imageX);}
                if(arr[0][3]==1){arr[0][3]=0;img4.setImage(imageO);}else{arr[0][3]=1;img4.setImage(imageX);}
            } else if (mouseEvent.getSource() == img4) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][2]==1){arr[0][2]=0;img3.setImage(imageO);}else{arr[0][2]=1;img3.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[1][3]==1){arr[1][3]=0;img8.setImage(imageO);}else{arr[1][3]=1;img8.setImage(imageX);}
            } else if (mouseEvent.getSource() == img5) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][0]==1){arr[0][0]=0;img1.setImage(imageO);}else{arr[0][0]=1;img1.setImage(imageX);}
                if(arr[0][1]==1){arr[0][1]=0;img2.setImage(imageO);}else{arr[0][1]=1;img2.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[2][0]==1){arr[2][0]=0;img9.setImage(imageO);}else{arr[2][0]=1;img9.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
            } else if (mouseEvent.getSource() == img6) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][0]==1){arr[0][0]=0;img1.setImage(imageO);}else{arr[0][0]=1;img1.setImage(imageX);}
                if(arr[0][1]==1){arr[0][1]=0;img2.setImage(imageO);}else{arr[0][1]=1;img2.setImage(imageX);}
                if(arr[0][2]==1){arr[0][2]=0;img3.setImage(imageO);}else{arr[0][2]=1;img3.setImage(imageX);}
                if(arr[1][0]==1){arr[1][0]=0;img5.setImage(imageO);}else{arr[1][0]=1;img5.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[2][0]==1){arr[2][0]=0;img9.setImage(imageO);}else{arr[2][0]=1;img9.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
            } else if (mouseEvent.getSource() == img7) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][1]==1){arr[0][1]=0;img2.setImage(imageO);}else{arr[0][1]=1;img2.setImage(imageX);}
                if(arr[0][2]==1){arr[0][2]=0;img3.setImage(imageO);}else{arr[0][2]=1;img3.setImage(imageX);}
                if(arr[0][3]==1){arr[0][3]=0;img4.setImage(imageO);}else{arr[0][3]=1;img4.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[1][3]==1){arr[1][3]=0;img8.setImage(imageO);}else{arr[1][3]=1;img8.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[2][3]==1){arr[2][3]=0;img12.setImage(imageO);}else{arr[2][3]=1;img12.setImage(imageX);}
            } else if (mouseEvent.getSource() == img8) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[0][2]==1){arr[0][2]=0;img3.setImage(imageO);}else{arr[0][2]=1;img3.setImage(imageX);}
                if(arr[0][3]==1){arr[0][3]=0;img4.setImage(imageO);}else{arr[0][3]=1;img4.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[2][3]==1){arr[2][3]=0;img12.setImage(imageO);}else{arr[2][3]=1;img12.setImage(imageX);}
            } else if (mouseEvent.getSource() == img9) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[1][0]==1){arr[1][0]=0;img5.setImage(imageO);}else{arr[1][0]=1;img5.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[3][0]==1){arr[3][0]=0;img13.setImage(imageO);}else{arr[3][0]=1;img13.setImage(imageX);}
                if(arr[3][1]==1){arr[3][1]=0;img14.setImage(imageO);}else{arr[3][1]=1;img14.setImage(imageX);}
            } else if (mouseEvent.getSource() == img10) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[1][0]==1){arr[1][0]=0;img5.setImage(imageO);}else{arr[1][0]=1;img5.setImage(imageX);}
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[2][0]==1){arr[2][0]=0;img9.setImage(imageO);}else{arr[2][0]=1;img9.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[3][0]==1){arr[3][0]=0;img13.setImage(imageO);}else{arr[3][0]=1;img13.setImage(imageX);}
                if(arr[3][1]==1){arr[3][1]=0;img14.setImage(imageO);}else{arr[3][1]=1;img14.setImage(imageX);}
                if(arr[3][2]==1){arr[3][2]=0;img15.setImage(imageO);}else{arr[3][2]=1;img15.setImage(imageX);}
            } else if (mouseEvent.getSource() == img11) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[1][1]==1){arr[1][1]=0;img6.setImage(imageO);}else{arr[1][1]=1;img6.setImage(imageX);}
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[1][3]==1){arr[1][3]=0;img8.setImage(imageO);}else{arr[1][3]=1;img8.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[2][3]==1){arr[2][3]=0;img12.setImage(imageO);}else{arr[2][3]=1;img12.setImage(imageX);}
                if(arr[3][1]==1){arr[3][1]=0;img14.setImage(imageO);}else{arr[3][1]=1;img14.setImage(imageX);}
                if(arr[3][2]==1){arr[3][2]=0;img15.setImage(imageO);}else{arr[3][2]=1;img15.setImage(imageX);}
                if(arr[3][3]==1){arr[3][3]=0;img16.setImage(imageO);}else{arr[3][3]=1;img16.setImage(imageX);}
            } else if (mouseEvent.getSource() == img12) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[1][2]==1){arr[1][2]=0;img7.setImage(imageO);}else{arr[1][2]=1;img7.setImage(imageX);}
                if(arr[1][3]==1){arr[1][3]=0;img8.setImage(imageO);}else{arr[1][3]=1;img8.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[3][2]==1){arr[3][2]=0;img15.setImage(imageO);}else{arr[3][2]=1;img15.setImage(imageX);}
                if(arr[3][3]==1){arr[3][3]=0;img16.setImage(imageO);}else{arr[3][3]=1;img16.setImage(imageX);}
            } else if (mouseEvent.getSource() == img13) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[2][0]==1){arr[2][0]=0;img9.setImage(imageO);}else{arr[2][0]=1;img9.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[3][1]==1){arr[3][1]=0;img14.setImage(imageO);}else{arr[3][1]=1;img14.setImage(imageX);}
            } else if (mouseEvent.getSource() == img14) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[3][0]==1){arr[3][0]=0;img13.setImage(imageO);}else{arr[3][0]=1;img13.setImage(imageX);}
                if(arr[2][0]==1){arr[2][0]=0;img9.setImage(imageO);}else{arr[2][0]=1;img9.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[3][2]==1){arr[3][2]=0;img15.setImage(imageO);}else{arr[3][2]=1;img15.setImage(imageX);}
            } else if (mouseEvent.getSource() == img15) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[3][1]==1){arr[3][1]=0;img14.setImage(imageO);}else{arr[3][1]=1;img14.setImage(imageX);}
                if(arr[2][1]==1){arr[2][1]=0;img10.setImage(imageO);}else{arr[2][1]=1;img10.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[2][3]==1){arr[2][3]=0;img12.setImage(imageO);}else{arr[2][3]=1;img12.setImage(imageX);}
                if(arr[3][3]==1){arr[3][3]=0;img16.setImage(imageO);}else{arr[3][3]=1;img16.setImage(imageX);}
            } else if (mouseEvent.getSource() == img16) {
                newgame_btn.setDisable(false);
                clicks++;
                counter.setText(String.valueOf(clicks));
                if(arr[3][2]==1){arr[3][2]=0;img15.setImage(imageO);}else{arr[3][2]=1;img15.setImage(imageX);}
                if(arr[2][2]==1){arr[2][2]=0;img11.setImage(imageO);}else{arr[2][2]=1;img11.setImage(imageX);}
                if(arr[2][3]==1){arr[2][3]=0;img12.setImage(imageO);}else{arr[2][3]=1;img12.setImage(imageX);}
            }
            int countX = 0;
            int countO = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (arr[i][j] == 1) {
                        countX++;
                    }
                    if (arr[i][j] == 0) {
                        countO++;
                    }
                }
            }
            if ((countX == 16) || (countO == 16)){
                gridpane.setDisable(true);
                winner.setText("You WON!");
                newgame_btn.setText("New game");
                inProgress=false;
                clicks=0;
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

package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

import java.io.IOException;

//INSERT DEPOSIT PAGE
public class Scene13Controller {

    @FXML private int balanceTot = 0;
    @FXML private String dFromButton = "";
    @FXML private Text text;

    public void balanceFromOthers(int balance){
        balanceTot = balance;
        String output = Integer.toString(balanceTot);
        text.setText(output);
    }

    @FXML
    private void toScreenOne(){
        loadPage("scene1.fxml", 1);
    }

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage) //pass any info
            {
                case 14:
                    Scene14Controller controller14 = loader.getController();
                    controller14.balanceFromOthers(balanceTot);
                    break;
            }

            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML
    private void clearButtons(){
        dFromButton = "";
    }

    @FXML private void depositSlotSelected(){
        int deposit = 0;
        Random r = new Random();
        int rand = r.nextInt(10 - 1) + 1;

        if (rand == 5)
            loadPage("scene12.fxml", 12);
        else {
            try{
                deposit = Integer.parseInt(dFromButton);
                balanceTot += deposit;
            } catch (NumberFormatException n){
                n.printStackTrace();
            }
            loadPage("scene14.fxml", 14);
        }
    }

    @FXML
    private void oneButtonMethod(){
        dFromButton = dFromButton + "1";
    }
    @FXML
    private void twoButtonMethod(){
        dFromButton = dFromButton + "2";
    }
    @FXML
    private void threeButtonMethod(){
        dFromButton = dFromButton + "3";
    }
    @FXML
    private void fourButtonMethod(){
        dFromButton = dFromButton + "4";
    }
    @FXML
    private void fiveButtonMethod(){
        dFromButton = dFromButton + "5";
    }
    @FXML
    private void sixButtonMethod(){
        dFromButton = dFromButton + "6";
    }
    @FXML
    private void sevenButtonMethod(){
        dFromButton = dFromButton + "7";
    }
    @FXML
    private void eightButtonMethod(){
        dFromButton = dFromButton + "8";
    }
    @FXML
    private void nineButtonMethod(){
        dFromButton = dFromButton + "9";
    }
    @FXML
    private void zeroButtonMethod(){
        dFromButton = dFromButton + "0";
    }
}

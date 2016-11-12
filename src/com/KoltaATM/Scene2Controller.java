package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

//SCREEN WITH PIN ENTRY
public class Scene2Controller {

    @FXML private String pinFromButton = "";
    @FXML private String cardNumber = "";

    @FXML //clear pin entry
    private void clearEntry() {
        pinFromButton = "";
    }

    @FXML
    public void cardNumberFromScene1(String card) {
        cardNumber = card;
    }

    @FXML //cancel was clicked
    private void toScreenOne() throws IOException {
        loadPage("scene1.fxml", 1);
    }

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage) //pass any info
            {
                case 3:
                    Scene3Controller controller3 = loader.getController();
                    controller3.pinEntryToIncorrectPin(cardNumber);
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
    private void toTransactionType() throws IOException {
        if ((cardNumber.equals("123456") && pinFromButton.equals("1234")) || (cardNumber.equals("654321") && pinFromButton.equals("4321")))
            loadPage("scene5.fxml", 5); //pin page
        else
            loadPage("scene3.fxml", 3); //card is kept page
    }


    @FXML
    private void oneButtonMethod(){ pinFromButton = pinFromButton + "1";}
    @FXML
    private void twoButtonMethod(){
        pinFromButton = pinFromButton + "2";
    }
    @FXML
    private void threeButtonMethod(){
        pinFromButton = pinFromButton + "3";
    }
    @FXML
    private void fourButtonMethod(){
        pinFromButton = pinFromButton + "4";
    }
    @FXML
    private void fiveButtonMethod(){
        pinFromButton = pinFromButton + "5";
    }
    @FXML
    private void sixButtonMethod(){
        pinFromButton = pinFromButton + "6";
    }
    @FXML
    private void sevenButtonMethod(){
        pinFromButton = pinFromButton + "7";
    }
    @FXML
    private void eightButtonMethod(){
        pinFromButton = pinFromButton + "8";
    }
    @FXML
    private void nineButtonMethod(){
        pinFromButton = pinFromButton + "9";
    }
    @FXML
    private void zeroButtonMethod(){
        pinFromButton = pinFromButton + "0";
    }

}

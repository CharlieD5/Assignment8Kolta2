package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

//WELCOME SCREEN WITH CARD NUMBER
public class Scene3Controller {

    @FXML private String cardNumber = "";
    @FXML private String pinFromButton = "";
    @FXML private int pinEntries = 0;
    @FXML private Text setAttempts; //display attempts remaining

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();
            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML
    public void pinEntryToIncorrectPin(String card) {
        cardNumber = card;
    }

    @FXML
    private void clearEntry() {
        pinFromButton = "";
    }

    @FXML
    private void toTransactionType() throws IOException {
        if ((cardNumber.equals("123456") && pinFromButton.equals("1234")) || (cardNumber.equals("654321") && pinFromButton.equals("4321")) && pinEntries < 3)
            loadPage("scene5.fxml", 5); //pin page
        else if (pinEntries >= 3)
            loadPage("scene4.fxml", 4); //card kept if too many pin entries
        else {
            pinFromButton = "";
            setAttempts.setText("Attempts Left: " + Integer.toString(3 - pinEntries));
            pinEntries++;
        }
    }

    @FXML //cancel clicked
    private void toScreenOne() throws IOException {
       loadPage("scene1.fxml", 1);
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

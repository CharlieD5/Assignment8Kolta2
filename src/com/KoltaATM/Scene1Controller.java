package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//WELCOME SCREEN WITH CARD NUMBER
public class Scene1Controller {

    @FXML private String cardFromButton = "";

    private void loadPage(String page, int scenePage){
        try
        {
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage)
            {
                case 2:
                    Scene2Controller controller2 = loader.getController();
                    controller2.cardNumberFromScene1(cardFromButton);
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
    private void clearEntry() {
        cardFromButton = "";
    }

    @FXML
    public void toPinEntry() throws IOException {

        if (cardFromButton.equals("123456") || cardFromButton.equals("654321"))
            loadPage("scene2.fxml", 2); //pin page
        else
            loadPage("scene4.fxml", 4); //card is kept page

    }


    @FXML
    private void oneButtonMethod(){
        cardFromButton = cardFromButton + "1";
    }
    @FXML
    private void twoButtonMethod(){
        cardFromButton = cardFromButton + "2";
    }
    @FXML
    private void threeButtonMethod(){
        cardFromButton = cardFromButton + "3";
    }
    @FXML
    private void fourButtonMethod(){
        cardFromButton = cardFromButton + "4";
    }
    @FXML
    private void fiveButtonMethod(){
        cardFromButton = cardFromButton + "5";
    }
    @FXML
    private void sixButtonMethod(){
        cardFromButton = cardFromButton + "6";
    }
    @FXML
    private void sevenButtonMethod(){
        cardFromButton = cardFromButton + "7";
    }
    @FXML
    private void eightButtonMethod(){
        cardFromButton = cardFromButton + "8";
    }
    @FXML
    private void nineButtonMethod(){
        cardFromButton = cardFromButton + "9";
    }
    @FXML
    private void zeroButtonMethod(){
        cardFromButton = cardFromButton + "0";
    }
}

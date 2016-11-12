package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Random;
import javafx.scene.text.Text;

public class Scene7Controller {

    @FXML private int balanceTot = 0;
    @FXML private String wFromButton = "";
    @FXML private Text text;

    public void balanceFromOthers(int balance){
        balanceTot = balance;
        String output = Integer.toString(balanceTot);
        text.setText(output);
    }

    @FXML
    private void clearEntry() {
        wFromButton = "";
    }

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage) //pass any info
            {
                case 8:
                    Scene8Controller controller8 = loader.getController();
                    controller8.balanceFromOthers(balanceTot);
                    break;
                case 9:
                    Scene9Controller controller9 = loader.getController();
                    controller9.balanceFromOthers(balanceTot);
                    break;
                case 10:
                    Scene10Controller controller10 = loader.getController();
                    controller10.balanceFromOthers(balanceTot);
                    break;
                case 11:
                    Scene11Controller controller11 = loader.getController();
                    controller11.balanceFromOthers(balanceTot);
                    break;
            }

            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML //enter clicked
    private void toWithdrawCash(){
        int withdrawAmount = 0;
        Random r = new Random();
        int rand = r.nextInt(10 - 1) + 1;

        try {
            if (!wFromButton.equals(""))
                withdrawAmount = Integer.parseInt(wFromButton);

        } catch (NumberFormatException n){
            n.printStackTrace();
        }

        if (rand == 5)
            loadPage("scene10.fxml", 10);
        else if (withdrawAmount > balanceTot && rand != 5)
            loadPage("scene8.fxml", 8);
        else if ((withdrawAmount % 10 != 0) && rand != 5)
            loadPage("scene9.fxml", 9);
        else {
            balanceTot -= withdrawAmount;
            loadPage("scene11.fxml", 11);
        }
        wFromButton = "";
    }
    @FXML //cancel clicked
    private void toScreenOne() throws IOException {
        loadPage("scene1.fxml", 1);
    }

    @FXML
    private void oneButtonMethod(){
        wFromButton = wFromButton + "1";
    }
    @FXML
    private void twoButtonMethod(){
        wFromButton = wFromButton + "2";
    }
    @FXML
    private void threeButtonMethod(){
        wFromButton = wFromButton + "3";
    }
    @FXML
    private void fourButtonMethod(){
        wFromButton = wFromButton + "4";
    }
    @FXML
    private void fiveButtonMethod(){
        wFromButton = wFromButton + "5";
    }
    @FXML
    private void sixButtonMethod(){
        wFromButton = wFromButton + "6";
    }
    @FXML
    private void sevenButtonMethod(){
        wFromButton = wFromButton + "7";
    }
    @FXML
    private void eightButtonMethod(){
        wFromButton = wFromButton + "8";
    }
    @FXML
    private void nineButtonMethod(){
        wFromButton = wFromButton + "9";
    }
    @FXML
    private void zeroButtonMethod(){
        wFromButton = wFromButton + "0";
    }
}

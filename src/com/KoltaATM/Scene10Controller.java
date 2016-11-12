package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene10Controller {
    @FXML private int balanceTot = 0;
    @FXML private Text text;

    public void balanceFromOthers(int balance){
        balanceTot = balance;
        String output = Integer.toString(balanceTot);
        text.setText(output);
    }

    private void loadPage(String page, int scenePage){
        try {
            Stage newStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            Parent root = loader.load();

            switch(scenePage) //pass any info
            {
                case 5:
                    Scene5Controller controller5 = loader.getController();
                    controller5.balanceFromOthers(balanceTot);
                    break;
            }
            Scene scene = new Scene(root, 500, 500);
            newStage.setScene(scene);
            newStage.show();
        } catch (IOException io){
            io.printStackTrace();
        }
    }

    @FXML //cancel clicked
    private void toScreenOne() throws IOException {
        loadPage("scene1.fxml", 1);
    }
    public void toThankYouScreen(){
        loadPage("scene15.fxml", 15);
    }
    public void toTransactionScreen(){
        loadPage("scene5.fxml", 5);
    }
}
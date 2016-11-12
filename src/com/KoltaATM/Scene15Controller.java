package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by jennasowers on 11/7/16.
 */
public class Scene15Controller {
    @FXML private boolean isReceiptPressed = false;
    @FXML private boolean isATMPressed = false;
    @FXML private Text text;

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
    private void cardSlotPressed(){
        isATMPressed = true;

        if (isATMPressed && isReceiptPressed)
            text.setText("Have a nice day!");
    }

    @FXML
    private void receiptPressed(){
        isReceiptPressed = true;

        if (isATMPressed && isReceiptPressed)
            text.setText("Have a nice day!");
    }
}

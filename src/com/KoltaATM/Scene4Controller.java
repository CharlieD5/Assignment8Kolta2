package com.KoltaATM;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Scene4Controller {

    @FXML
    public void toScreenOne() throws IOException {

            try {
                Stage newStage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
                Parent root = loader.load();
                Scene scene = new Scene(root, 500, 500);
                newStage.setScene(scene);
                newStage.show();
            } catch (IOException io){
                io.printStackTrace();
            }
    }

}

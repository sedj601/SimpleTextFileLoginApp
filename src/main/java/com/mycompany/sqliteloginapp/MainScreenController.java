package com.mycompany.sqliteloginapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

/**
 *
 * @author blj0011
 */
public class MainScreenController implements Initializable
{
    @FXML
    private Label lblUserName;
    @FXML
    private StackPane spSubScene;

    @FXML
    private void handleBtnOnActionAmazonPay(ActionEvent event)
    {
         System.out.println("You have to implement this!");
//        try {
//            System.out.println("Loading Overview FXML");
//            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLOverView.fxml"));
//            loader.load();
//            FXMLOverViewController fXMLOverViewController = loader.getController();
//            spSubScene.getChildren().set(0, fXMLOverViewController.getVBoxRoot());
//        }
//        catch (IOException ex) {
//            ex.printStackTrace();
//        }
    }

    @FXML
    private void handleBtnOnActionApplePay(ActionEvent event)
    {
         System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionPayPal(ActionEvent event)
    {
         System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionVisa(ActionEvent event)
    {
        System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionVenmo(ActionEvent event)
    {
        System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActioMasterCard(ActionEvent event)
    {
        System.out.println("You have to implement this!");
    }

    @FXML
    private void handleBtnOnActionSignOut(ActionEvent event)
    {
        System.out.println("Just Sign Out!");
        System.out.println("You might want to use an Alert that ask if they are sure they want to sign out.");
        Platform.exit();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }
    
    public void setUserName(String userName)
    {
        lblUserName.setText(userName);
    }
}

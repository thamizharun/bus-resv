package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PayView {


    private String namep;
    private String mdp;
    private int snp;
    private String fr2p;
    private String to2p;
    public void set2 (String n,int s,String f, String t) {

        this.to2p = t;
        this.fr2p=f;
        this.snp=s;
        this.namep=n;
    }
        @FXML
   public void pay(ActionEvent actionEvent){
       try {
           System.out.println("Trying to open new stage...");

           FXMLLoader loader = new FXMLLoader(getClass().getResource("tick-view.fxml"));

           Parent root = loader.load();

           TickView tvw = loader.getController();
           tvw.settick(namep,snp,fr2p,to2p);
           System.out.println("transfer"+namep+snp+fr2p+to2p);
           Scene scene = new Scene(root);
           Stage stage = new Stage();
           stage.setTitle("Ticket Booking");
           stage.setScene(scene);
           stage.show();

           System.out.println("New stage opened successfully.");
       } catch (IOException e) {
           e.printStackTrace();
           System.err.println("Error opening new stage: " + e.getMessage());
       }
    }
}

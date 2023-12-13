package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TbookView {

    @FXML
    private TextField name;

    @FXML
    private TextField mno;

    @FXML
    private TextField ano;

    @FXML
    private TextField sno;

    @FXML
    private TextField mid;

    public String name1, mid1,frb,trb;
    public int sno1;

    public long mno1, ano1;
    public void tbw(String f,String t){
        this.frb=f;
        this.trb=t;
    }
    @FXML
    public void enter(ActionEvent event) {

        name1 = name.getText();
        mid1 = mid.getText();

        try {
            // Parsing the text fields to long and int
            mno1 = Long.parseLong(mno.getText());
            ano1 = Long.parseLong(ano.getText());
            sno1 = Integer.parseInt(sno.getText());
        } catch (NumberFormatException e) {
            // Handle the case where the input is not a valid long or int
            System.err.println("Invalid input for mno, ano, or sno");
            return;
        }
        System.out.println(name1 + mid1 + mno1 + ano1 + sno1);

        try {
            System.out.println("Trying to open new stage...");

            FXMLLoader loader = new FXMLLoader(getClass().getResource("pay-view.fxml"));

            Parent root = loader.load();
            PayView pv = loader.getController();
            pv.set2(name1,sno1,frb,trb);
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

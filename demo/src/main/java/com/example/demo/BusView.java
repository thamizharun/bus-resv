package com.example.demo;
import java.lang.*;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.ArrayList;

public class BusView implements Initializable {

    @FXML
    private TableView<Bus> avlbus;

    @FXML
    private TableColumn<Bus, Integer> busno;

    @FXML
    private TableColumn<Bus, Boolean> ac;

    @FXML
    private TableColumn<Bus, Integer> cap;

    @FXML
    private TableColumn<Bus, String> from;

    @FXML
    private TableColumn<Bus, String> to;
    @FXML
    private TableColumn<Bus, Integer> price;

    String fromText;
    String toText;


    public void setUserdata(String f, String t) {
        this.fromText = f;
        this.toText = t;



        if ((fromText.equals("chennai")) && (toText.equals("sivaganga"))) {
            buses.add(new Bus(1, true, 50, "chennai", "sivaganga",1));
        } else if ((fromText.equals("chennai")) && (toText.equals("tiruvarur"))) {
            buses.add(new Bus(2, false, 50, "chennai", "tiruvarur",1));
        } else if ((fromText.equals("chennai")) && (toText.equals("mumbai"))) {
            buses.add(new Bus(3, true, 55, "chennai", "mumbai",1));
        } else if ((fromText.equals("chennai")) && (toText.equals("bangalore"))) {
            buses.add(new Bus(4, true, 48, "chennai", "bangalore",1));
        } else if ((fromText.equals("sivaganga")) && (toText.equals("chennai"))) {
            buses.add(new Bus(5, true, 52, "sivaganga", "chennai",1));
        } else if ((fromText.equals("tiruvarur")) && (toText.equals("chennai"))) {
            buses.add(new Bus(6, false, 50, "tiruvarur", "chennai",1));
        } else if ((fromText.equals("mumbai")) && (toText.equals("chennai"))) {
            buses.add(new Bus(7, true, 48, "mumbai", "chennai",1));
        } else if ((fromText.equals("bangalore")) && (toText.equals("chennai"))) {
            buses.add(new Bus(8, true, 48, "bangalore", "chennai",1));
        } else {
            buses.add(new Bus(0, false, 0, "INVALID", "INPUT",0));
        }


    }

    ObservableList<Bus> buses= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        busno.setCellValueFactory(new PropertyValueFactory<Bus,Integer>("busNo"));
        ac.setCellValueFactory(new PropertyValueFactory<Bus,Boolean>("ac"));
        cap.setCellValueFactory(new PropertyValueFactory<Bus,Integer>("capacity"));
        from.setCellValueFactory(new PropertyValueFactory<Bus,String>("fr1"));
        to.setCellValueFactory(new PropertyValueFactory<Bus,String>("t1"));
        price.setCellValueFactory(new PropertyValueFactory<Bus,Integer>("price"));
        avlbus.setItems(buses);
       // avlbus.getItems().addAll(buses);
    }
    @FXML
    private void booknow(ActionEvent event) {
        try {
            System.out.println("Trying to open new stage...");

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("tbook-view.fxml"));
            Parent root = fxmlLoader.load();
            TbookView ta = fxmlLoader.getController();

            ta.tbw(fromText,toText);
           // ta.set2(fromText,toText);
            Scene scene = new Scene(root, 600, 400);
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










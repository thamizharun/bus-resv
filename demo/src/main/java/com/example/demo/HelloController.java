package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class HelloController {

    @FXML
    private TextField from;

    @FXML
    private TextField to;

    @FXML
    private DatePicker dateInput;
    public String fromText, toText;

    @FXML
    private void searchbus(ActionEvent event) {
        fromText = from.getText();
        toText = to.getText();

        System.out.println("From: " + fromText + ", To: " + toText);

        LocalDate selectedDate = dateInput.getValue();
        if (selectedDate != null) {
            System.out.println("Date: " + selectedDate);
            // If you need to use the selected date, you can use 'selectedDate' directly
        } else {
            System.out.println("No date selected.");
        }

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bus-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            BusView bs =  fxmlLoader.getController();
            bs.setUserdata(fromText, toText);
            Stage stage = new Stage();
            stage.setTitle("Bus Selection");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the IOException (e.g., show an error message to the user)
        } catch (Exception e) {
            e.printStackTrace();
            // Print the stack trace of the actual exception causing InvocationTargetException
        }
    }
}

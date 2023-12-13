package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TickView {

    @FXML
    private Label fr;

    @FXML
    private Label fr1;

    @FXML
    private Label pname;

    @FXML
    private Label pname1;

    @FXML
    private Label to;

    @FXML
    private Label to1;

    @FXML
    private Label tSeats;

    @FXML
    private Label tSeats1;

    private String name;
    private String md;
    private int sn;
    private String fr2;
    private String to2;


    @FXML
    public void initialize() {
        // Null checks for labels

            pname.setText(name);
            pname1.setText(name);



            fr.setText(fr2);
            fr1.setText(fr2);



            to.setText(to2);
            to1.setText(to2);



            tSeats.setText(Integer.toString(sn));
            tSeats1.setText(Integer.toString(sn));

    }


        public void settick (String n,int s,String f,String t){

            this.sn = s;
            this.name = n;
            this.fr2 = f;
            this.to2 = t;
            System.out.println("new "+md+sn+name);
            tSeats.setText(Integer.toString(sn));
            tSeats1.setText(Integer.toString(sn));
            pname.setText(name);
            pname1.setText(name);
            fr.setText(fr2);
            fr1.setText(fr2);
            to.setText(to2);
            to1.setText(to2);

        }





    }
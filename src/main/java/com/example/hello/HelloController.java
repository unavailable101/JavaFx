package com.example.hello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.*;

import static javafx.application.Application.launch;

public class HelloController {
    public GridPane logout;
    @FXML
    private Text me;
    @FXML
    private GridPane whole;
    private VBox lain;

    @FXML
    private ColorPicker colors;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }
    @FXML
    public void signIn(ActionEvent actionEvent) throws IOException {
       //me.setText("Sign in button is pressed*");
        Parent index = FXMLLoader.load(HelloApplication.class.getResource("index.fxml"));
        AnchorPane screen = (AnchorPane) whole.getParent();
        screen.getScene().getStylesheets().clear();
        screen.getScene().getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        screen.getChildren().remove(whole);
        screen.getChildren().add(index);



    }


    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent out = FXMLLoader.load(HelloApplication.class.getResource("hello-view.fxml"));

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(getClass().getResource("styles.css").getPath()));
            bw.write(".button{ -fx-background-color: #" + colors.getValue().toString().substring(2,8) + "; }");
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        VBox screen = (VBox) logout.getParent();
        screen.getChildren().remove(logout);
        screen.getChildren().add(out);
    }
}
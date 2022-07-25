package com.genspark.Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.Objects;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/View/second.fxml"));
        System.out.println(getClass().getResource("/CssStyle/backgroundStyle.css"));
        //Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("View/aviation.fxml")));

            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(scene);
            stage.show();

            System.out.println("idk man");




    }


    //HELLO JOHN FROM MARTIN

    public static void main(String[] args) {
        launch();
    }
}
package com.mamar.bank.mamarbankjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public  void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage1 = new Stage(); // Create a new stage instance
        stage1.setScene(scene);

        stage1.show();
    }
}

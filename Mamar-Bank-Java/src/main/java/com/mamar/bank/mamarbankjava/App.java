package com.mamar.bank.mamarbankjava;

import com.mamar.bank.mamarbankjava.Models.Model;
import com.mamar.bank.mamarbankjava.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public  void start(Stage stage)  {
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}

// 

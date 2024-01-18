package com.mamar.bank.mamarbankjava.Views;

import com.mamar.bank.mamarbankjava.Controllers.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {

    public final StringProperty clientSelectedMenuItem;
    public AnchorPane dashboardView;
    private AnchorPane transactionView;
    private AnchorPane accountView;

    public ViewFactory(){
        this.clientSelectedMenuItem = new SimpleStringProperty("");
    }

    public StringProperty getClientSelectedMenuItem() {
        return clientSelectedMenuItem;
    }

    // client views

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml"));
                dashboardView = loader.load();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public AnchorPane getTransactionView() {
        if(transactionView == null){
            try {
                transactionView = new FXMLLoader(getClass().getResource("/Fxml/Client/Transaction.fxml")).load();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return transactionView;
    }

    public void showLoginWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController = new ClientController();
        loader.setController(clientController);
        createStage(loader);
    }

    public AnchorPane getAccountView() {
        if(accountView == null){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Accounts.fxml")).load();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return accountView;

    }

    private Scene scene2; // Corrected variable name
    private void createStage(FXMLLoader loader) {
        try {
            scene2 = new Scene(loader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene2);
        stage.setTitle("Mamar Bank");
        stage.show();
    }
    public void closeStage(Stage stage){
        stage.close();
    }
}


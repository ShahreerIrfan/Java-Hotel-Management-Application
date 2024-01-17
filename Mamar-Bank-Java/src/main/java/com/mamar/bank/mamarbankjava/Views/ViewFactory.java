package com.mamar.bank.mamarbankjava.Views;

import com.mamar.bank.mamarbankjava.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
    // client views
    private AnchorPane dashboardView;
    private AnchorPane TransactionView;
    private Scene scene2; // Corrected variable name

    public ViewFactory() {}

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
       if(TransactionView == null){
            try {
                TransactionView = new FXMLLoader(getClass().getResource("/Fxml/Client/Transaction.fxml")).load();
            }catch (Exception e){
                e.printStackTrace();
            }
       }
       return TransactionView;
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

//
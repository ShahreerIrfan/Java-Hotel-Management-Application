package com.mamar.bank.mamarbankjava.Controllers.Client;

import com.mamar.bank.mamarbankjava.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


import java.net.URL;
import java.util.ResourceBundle;

public class ClientMenuController implements Initializable {
    public BorderPane client_parent;
    public Button report_btn;
    public Button dashboard_btn;
    public Button transactions_btn;
    public Button accounts_btn;
    public Button profile_btn;
    public Button logout_btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addListeners();
    }

    private void addListeners() {
        dashboard_btn.setOnAction(event -> onDashboard());
        transactions_btn.setOnAction(event -> onTransaction());
        accounts_btn.setOnAction(event -> onAccount());
    }

    private void onDashboard() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
    }

    private void onTransaction() {
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
    }
    private void onAccount(){
        Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
    }
}

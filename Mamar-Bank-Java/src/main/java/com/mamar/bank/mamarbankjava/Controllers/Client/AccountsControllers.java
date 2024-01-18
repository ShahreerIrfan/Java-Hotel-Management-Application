package com.mamar.bank.mamarbankjava.Controllers.Client;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountsControllers implements Initializable {
    public Label ch_acc_num;
    public Label transaction_limit;
    public Label ch_account_date;
    public Label ch_acc_bal;
    public Label sv_acc_num;
    public Label withdrawal_limit;
    public Label sv_acc_date;
    public Label sv_acc_bal;
    public Button transper_to_sv_btn;
    public Button transper_to_cv_btn;
    public TextField amount_to_sv;
    public TextField amount_to_ch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

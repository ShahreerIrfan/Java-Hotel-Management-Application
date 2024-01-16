module com.mamar.bank.mamarbankjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mamar.bank.mamarbankjava to javafx.fxml;
    exports com.mamar.bank.mamarbankjava;
}
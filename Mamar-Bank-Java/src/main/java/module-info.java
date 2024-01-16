module com.mamar.bank.mamarbankjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.mamar.bank.mamarbankjava to javafx.fxml;
    exports com.mamar.bank.mamarbankjava;
    exports  com.mamar.bank.mamarbankjava.Controllers;
    exports com.mamar.bank.mamarbankjava.Controllers.Admin;
    exports com.mamar.bank.mamarbankjava.Controllers.Client;
    exports com.mamar.bank.mamarbankjava.Models;
    exports com.mamar.bank.mamarbankjava.Views;
}
module com.mycompany.sqliteloginapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.paymentfont;
    requires org.kordamp.ikonli.dashicons;
    
    opens com.mycompany.sqliteloginapp to javafx.fxml;
    exports com.mycompany.sqliteloginapp;
}

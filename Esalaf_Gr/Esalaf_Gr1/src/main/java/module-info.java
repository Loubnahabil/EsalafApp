module com.example.esalaf {
    requires javafx.controls;
    requires javafx.fxml;
    requires mysql.connector.j;


    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    requires java.sql;

    opens com.example.esalaf to javafx.fxml;

    opens  com.exemple.model;

   // opens com.example.model ;
    exports com.example.esalaf;
}
module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires activation;
    requires java.mail;

    opens com.example.test to javafx.fxml;
    exports com.example.test;
    opens com.example.test.Controller;
    opens com.example.test.Model;
}
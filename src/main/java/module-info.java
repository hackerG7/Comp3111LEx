module com.example.comp3111lex {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.Lab1 to javafx.fxml;
    exports com.example.Lab1;
}
module com.example.imagemanagementtool {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.swing;

    opens com.example.imagemanagementtool to javafx.fxml;
    exports com.example.imagemanagementtool;
}
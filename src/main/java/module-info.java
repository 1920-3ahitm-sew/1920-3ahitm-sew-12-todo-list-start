module at.htl.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens at.htl.javafx to javafx.fxml;
    exports at.htl.javafx;
}
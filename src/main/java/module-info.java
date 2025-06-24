module com.github.gman2605.chess_app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.gman2605.chess_app to javafx.fxml;
    exports com.github.gman2605.chess_app;
}

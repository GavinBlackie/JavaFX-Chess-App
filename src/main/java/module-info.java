module gman2605.chess {
    requires javafx.controls;
    requires javafx.fxml;

    opens gman2605.chess to javafx.fxml;
    exports gman2605.chess;
}

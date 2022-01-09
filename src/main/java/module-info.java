module com.livenhlproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.livenhlproject to javafx.fxml;
    exports com.livenhlproject;
    exports com.livenhlproject.Controllers;
    opens com.livenhlproject.Controllers to javafx.fxml;
}
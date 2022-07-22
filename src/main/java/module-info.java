module com.example.gs_airlinetrackerappmain {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
            requires com.dlsc.formsfx;
            requires validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens com.example.gs_airlinetrackerappmain to javafx.fxml;
    exports com.example.gs_airlinetrackerappmain;
}
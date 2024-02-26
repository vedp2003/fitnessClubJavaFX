module fitnessclub.fitnessclubjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens fitnessclub to javafx.fxml;
    exports fitnessclub;
}
module fitnessclub.fitnessclubjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens fitnessclub.fitnessclubjavafx to javafx.fxml;
    exports fitnessclub.fitnessclubjavafx;
}
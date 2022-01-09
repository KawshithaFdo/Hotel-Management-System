package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MainFormController {
    public AnchorPane MainFormContext;

    public void OpenAdminForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) MainFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenReceptionistForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) MainFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}

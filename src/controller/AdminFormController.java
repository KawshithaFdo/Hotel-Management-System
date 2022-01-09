package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminFormController {
    public AnchorPane AdminFormContext;

    public void gotoHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MainForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AdminFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenNewAdmin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/NewAdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AdminFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void OpenAdminLogin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) AdminFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}

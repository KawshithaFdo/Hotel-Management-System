package controller;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class AddBookingFormController {
    public AnchorPane AddBookingContext;
    public static TableView tblBooking;
    public TableColumn colName;
    public TableColumn colNic;
    public TableColumn ColContact;
    public TableColumn ColEmail;
    public TableColumn ColAddress;
    public TableColumn ColSD;
    public TableColumn ColED;
    public TableColumn ColPrice;


    public void GoBack(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to go Back?", yes, no);
        alert.setTitle("Alert");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(no) == yes) {
            URL resource = getClass().getResource("../view/ReceptionistViewBookingForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) AddBookingContext.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {
        }
    }

    public void SendEMail(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, " Mail Sended .", ButtonType.CLOSE).show();
    }

    public void PrintRecipt(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION, "  Receipt Printed.", ButtonType.CLOSE).show();
    }
}

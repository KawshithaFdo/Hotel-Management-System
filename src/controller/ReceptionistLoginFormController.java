package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class ReceptionistLoginFormController {
    public AnchorPane ReceptionistLoginContext;

    public void GoBack(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to go Back?", yes, no);
        alert.setTitle("Alert");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(no) == yes) {
            URL resource = getClass().getResource("../view/ReceptionistForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) ReceptionistLoginContext.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {
        }
    }

    public void ViewRoomsandMealsAvailable(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionistRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionistLoginContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void ViewBookings(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/BookingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionistLoginContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void ViewRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RViewRooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionistLoginContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}

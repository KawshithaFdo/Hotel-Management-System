package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Customer;
import view.tm.CustomerTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

import static controller.AddBookingFormController.tblBooking;

public class ReceptionistViewBookingFormController {
    public AnchorPane ReceptionistViewBookingContext;
    public JFXTextField txtName;
    public JFXTextField txtNic;
    public JFXTextField txtContact;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public JFXTextField txtSDate;
    public JFXTextField txtEndDate;
    public JFXTextField txtPrice;

   static ArrayList<Customer> customerlist=new ArrayList();


    public void GoBack(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to go Back?", yes, no);
        alert.setTitle("Alert");
        Optional<ButtonType> result = alert.showAndWait();

        if (result.orElse(no) == yes) {
            URL resource = getClass().getResource("../view/BookingForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) ReceptionistViewBookingContext.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {

        }
    }

    public void AddBooking(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddBookingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionistViewBookingContext.getScene().getWindow();
        window.setScene(new Scene(load));

        Customer customer=new Customer(txtName.getText(),txtNic.getText(),txtContact.getText(),txtEmail.getText(),txtAddress.getText(),txtSDate.getText(),txtEndDate.getText(),txtPrice.getText());
        if(customerlist.add(customer)){
            new Alert(Alert.AlertType.CONFIRMATION,"Saved...",ButtonType.CLOSE).show();
          //  LoadAllCustomers();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again...",ButtonType.CLOSE).show();
        }
    }
    /*private void LoadAllCustomers(){
        ObservableList<CustomerTM> tmObservableList = FXCollections.observableArrayList();
        for (Customer temp:customerlist
             ) {
            tmObservableList.add(
                    new CustomerTM(temp.getName(),temp.getNic(),temp.getContact(),temp.getEmail(),temp.getAddress(),temp.getSdate(),temp.getEdate(),temp.getPrice())
            );

        }
        tblBooking.setItems(tmObservableList);
    }*/
}

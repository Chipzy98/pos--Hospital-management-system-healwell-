package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MedicalStaffFormController {

    public AnchorPane pane2;
    public void AddDoctorbuttonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane2.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddDoctorForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void AddNurseOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane2.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AddNurseForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    public void AddOtherStaffOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane2.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/OtherStaffForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}//last

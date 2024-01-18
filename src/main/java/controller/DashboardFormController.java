package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {

    public AnchorPane pane;


    public void MedicalsbuttonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MedicalStaffForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void PationbuttonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PatientsForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    @FXML
    void ViewReportsbuttonOnAction(ActionEvent event) {
        Stage stage = (Stage) pane.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewReportsForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}//last

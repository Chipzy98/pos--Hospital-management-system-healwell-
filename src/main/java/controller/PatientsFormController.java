package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PatientsFormController {

    public AnchorPane pane1;

    public void BackbuttonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane1.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void AddpationButtonOnAction(ActionEvent actionEvent) {
        Stage stage = (Stage) pane1.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/PatientDetailsForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }


    public void DAppointmenOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane1.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DoctorAppointmentForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }


    public void LabtestOnActionButton(ActionEvent actionEvent) {
    }

    public void MedicalReportOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane1.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReportForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}//last
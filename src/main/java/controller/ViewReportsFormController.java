package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewReportsFormController {

    @FXML
    private AnchorPane pane7;
    public void MReportOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane7.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewMedicalReport.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void LReportOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane7.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ViewLabReportForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void BackOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane7.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

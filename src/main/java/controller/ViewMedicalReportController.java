package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.tm.ReportTm;

import java.io.IOException;
import java.sql.*;

public class ViewMedicalReportController {

    public AnchorPane pane10;

    @FXML
    private TableView<ReportTm> reportTable;

    @FXML
    private TableColumn<ReportTm, String> rid;

    @FXML
    private TableColumn<ReportTm, String> patientname;

    @FXML
    private TableColumn<ReportTm, String> doctorname;

    @FXML
    private TableColumn<ReportTm, String> diagnosis;

    @FXML
    private TableColumn<ReportTm, String> result;

    @FXML
    private TableColumn<ReportTm, String> treatment;

    @FXML
    private Button refresh;

    public void initialize() {
        rid.setCellValueFactory(new PropertyValueFactory<>("RecodeID"));
        patientname.setCellValueFactory(new PropertyValueFactory<>("p_name"));
        doctorname.setCellValueFactory(new PropertyValueFactory<>("d_name"));
        diagnosis.setCellValueFactory(new PropertyValueFactory<>("diagnisis"));
        result.setCellValueFactory(new PropertyValueFactory<>("result"));
        treatment.setCellValueFactory(new PropertyValueFactory<>("Treat"));
        loadreportTable();
    }

    private void loadreportTable() {
        ObservableList<ReportTm> reportlist = FXCollections.observableArrayList();
        String sql1 = "SELECT record_id, patient_name, doctor_name, diagnosis, test_results, treatments FROM medicalrecords;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healwell", "root", "3682");
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery(sql1);

            while (result.next()) {

                ReportTm ar = new ReportTm(
                        result.getString("record_id"),
                        result.getString("patient_name"),
                        result.getString("doctor_name"),
                        result.getString("diagnosis"),
                        result.getString("test_results"),
                        result.getString("treatments")
                );
                reportlist.add(ar);
            }
            connection.close();

            reportTable.setItems(reportlist);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void RefreshOnActionButton(ActionEvent event) {
        loadreportTable();
        clearFields();
    }

    private void clearFields() {
        // You might need to implement this method based on your requirements.
        // If you want to clear any specific fields or perform other actions, you can add them here.
    }

    public void BackOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane10.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}

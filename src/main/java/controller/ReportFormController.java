package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AddRecods;

import java.io.IOException;
import java.sql.*;

public class ReportFormController {

    @FXML
    private AnchorPane pane8;

    @FXML
    private TextField txtRecordid;

    @FXML
    private TextField txtpid;

    @FXML
    private TextField txtdid;

    @FXML
    private Button submitbtn;

    @FXML
    private Button clearbtn;

    @FXML
    private TextArea txtDiagnosis;

    @FXML
    private TextArea txtTreats;

    @FXML
    private TextField txtresult;

    @FXML
    private Button backbtn;

    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtdname;

    @FXML
    void BackOnActionButton(ActionEvent event) {
        Stage stage = (Stage) pane8.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @FXML
    void ClearOnActionButton(ActionEvent event) {
        txtresult.clear();
        txtdname.clear();
        txtdid.clear();
        txtpname.clear();
        txtpid.clear();
        txtRecordid.clear();
        txtDiagnosis.clear();
        txtTreats.clear();
    }

    @FXML
    void SubmitOnActionButton(ActionEvent event) {
        AddRecods re = new AddRecods(txtRecordid.getText(),
                txtpid.getText(),
                txtdid.getText(),
                txtpname.getText(),
                txtdname.getText(),
                txtDiagnosis.getText(),
                txtresult.getText(),
                txtTreats.getText()
        );

        String sql = "INSERT INTO medicalrecords VALUES('"+re.getRecodeID()+"','"+re.getP_ID()+"','"+re.getP_name()+"','"+re.getPID()+"','"+re.getD_name()+"','"+re.getDiagnisis()+"','"+re.getResult()+"','"+re.getTreat()+"')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healwell", "root", "3682");
            Statement stm = connection.createStatement();
            int result = stm.executeUpdate(sql);
            if(result>0){
                new Alert(Alert.AlertType.INFORMATION,"Patient Saved!").show();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

}//last
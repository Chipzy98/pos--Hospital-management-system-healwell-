package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AddDoctor;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddDoctorFormController {

    public AnchorPane pane4;

    @FXML
    private TextField txtDID;

    @FXML
    private TextField txtDname;

    @FXML
    private TextField txtDdepartment;

    @FXML
    private Button savebtn;

    @FXML
    private Button clearbtn;

    @FXML
    void ClearbuttonOnAction(ActionEvent event) {
        txtDID.clear();
        txtDname.clear();
        txtDdepartment.clear();

    }

    @FXML
    void SavebuttonOnAction(ActionEvent event) {
        AddDoctor ad = new AddDoctor(txtDID.getText(),
                txtDname.getText(),
                txtDdepartment.getText()
        );

        String sql1 = "INSERT INTO doctor VALUES('"+ad.getDoctorID()+"','"+ad.getDoctorName()+"','"+ad.getdDepartment()+"')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healwell", "root", "3682");
            Statement stm = connection.createStatement();
            int result = stm.executeUpdate(sql1);
            if(result>0){
                new Alert(Alert.AlertType.INFORMATION,"Doctor Saved!").show();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }//savebtn

    public void BackOnActionButton(ActionEvent actionEvent) {
        Stage stage = (Stage) pane4.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}//last

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
import model.AppointmentDetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DoctorAppointmentFormController {

    @FXML
    private AnchorPane pane3;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtpname;

    @FXML
    private TextField txtcnum;

    @FXML
    private TextField txtdID;

    @FXML
    private Button dappointmmentbtn;

    @FXML
    private TextField AppIDtxt;

    @FXML
    private Button back2btn;

    @FXML
    private TextField txtappdate;

    @FXML
    void Back2ButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) pane3.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @FXML
    void DASubmitbuttonOnAction(ActionEvent event) {
        AppointmentDetails da = new AppointmentDetails(AppIDtxt.getText(),
                txtID.getText(),
                txtpname.getText(),
                txtcnum.getText(),
                txtdID.getText(),
                txtappdate.getText()

        );
        String sql1 = "INSERT INTO doctor_appointment VALUE ('"+da.getAppID()+"','"+da.getPid()+"','"+da.getPname()+"','"+da.getP_Cnum()+"','"+da.getD_ID()+"','"+da.getAppdate()+"')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healwell", "root", "3682");
            Statement stm = connection.createStatement();
            int result = stm.executeUpdate(sql1);
            if(result>0){
                new Alert(Alert.AlertType.INFORMATION,"Appointment Saved!").show();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }//button

}//last

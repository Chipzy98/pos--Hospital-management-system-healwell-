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
import model.PatientDetails;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientDetailsFormController {

        public AnchorPane pane5;

        @FXML
        private TextField txtID;

        @FXML
        private TextField txtName;

        @FXML
        private TextField txtgender;

        @FXML
        private TextArea txtaddress;

        @FXML
        private TextField txtcontact;

        @FXML
        private Button PRegisterbtn;

        @FXML
        private TextField txttoday;

        @FXML
        private TextField txtdob;

        @FXML
        void PRegisterbuttonOnAction(ActionEvent event) {
                PatientDetails pd = new PatientDetails(txttoday.getText(),
                        txtID.getText(),
                        txtName.getText(),
                        txtdob.getText(),
                        txtcontact.getText(),
                        txtgender.getText(),
                        txtaddress.getText()
                );

                String sql = "INSERT INTO patient_details VALUES('"+pd.getToday()+"','"+pd.getId()+"','"+pd.getName()+"','"+pd.getDob()+"','"+pd.getCnumber()+"','"+pd.getGender()+"','"+pd.getAddress()+"')";

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

    public void BackbuttonOnAction(ActionEvent actionEvent) {
            Stage stage = (Stage) pane5.getScene().getWindow();

            try {
                    stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
            } catch (IOException e) {
                    e.printStackTrace();

            }

    }
}

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
import model.AddNurse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddNurseFormController {

    @FXML
    private AnchorPane pane6;

    @FXML
    private TextField txtNid;

    @FXML
    private TextField txtNname;

    @FXML
    private TextField txtNdep;

    @FXML
    private Button savebtn;

    @FXML
    private Button clearbtn;

    @FXML
    private Button backbtn;

    @FXML
    private TextField txtwnum;

    @FXML
    void BackOnActionButton(ActionEvent event) {
        Stage stage = (Stage) pane6.getScene().getWindow();

        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DashboardForm.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    @FXML
    void ClearOnAnctionButton(ActionEvent event) {
        txtNid.clear();
        txtNname.clear();
        txtNdep.clear();
        txtwnum.clear();

    }

    @FXML
    void SaveOnActionButton(ActionEvent event) {
        AddNurse nd = new AddNurse(txtNid.getText(),
                txtNname.getText(),
                txtNdep.getText(),
                txtwnum.getText()
        );

        String sql1 = "INSERT INTO nurse VALUES('"+nd.getNID()+"','"+nd.getNname()+"','"+nd.getNdepart()+"','"+nd.getWardnum()+"')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healwell", "root", "3682");
            Statement stm = connection.createStatement();
            int result = stm.executeUpdate(sql1);
            if(result>0){
                new Alert(Alert.AlertType.INFORMATION,"New Nurse Saved!").show();
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public void DeleteOnAnctionButton(ActionEvent actionEvent) {

    }
}//last

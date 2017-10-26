package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Controller {
    @FXML
    private Label status;

    @FXML
    private TextField username;

    @FXML
    private TextField password;

    public void Login(ActionEvent event) throws Exception{
        if (username.getText().equals("user") && password.getText().equals("pass")) {
            status.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

            primaryStage.setTitle("Login");
            primaryStage.setScene(scene);
            primaryStage.show();
        } else {
            status.setText("Login Failed");
        }
    }

}

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
            MainScene();
            Main.stage.setTitle("Login");
            Main.stage.setScene(Main.scene);
            Main.stage.show();
        } else {
            status.setText("Login Failed");
        }
    }

    private void MainScene() throws Exception{
        Main.root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene loginScene = Main.stage.getScene();
        if (Main.scene == null) {
            Main.scene = new Scene(Main.root);
            //Main.scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
            Main.stage.setScene(Main.scene);
        } else {
            Main.stage.getScene().setRoot(Main.root);
        }
    }

}

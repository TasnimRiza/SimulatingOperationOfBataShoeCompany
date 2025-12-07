package sulthanatasnimriza.simulatingoperationofbatashoecompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    public void goToTheCustomerDashboard(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CU_Dashboard.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("Customer Dashboard");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @FXML
    public void goToTheRetailManagerDashboard(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_Dashboard.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("Retail Manager Dashboard");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }
}
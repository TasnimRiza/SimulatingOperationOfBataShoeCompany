package sulthanatasnimriza.simulatingoperationofbatashoecompany;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RetailManagerDashboard
{
    @javafx.fxml.FXML
    private Button processProductReturnsButton;
    @javafx.fxml.FXML
    private Button approveCustomerOrdersButton;
    @javafx.fxml.FXML
    private Button monitorDailyStoreSalesButton;
    @javafx.fxml.FXML
    private Button scheduleStaffandAssignTasksButton;
    @javafx.fxml.FXML
    private Button generatePerformanceReportsButton;
    @javafx.fxml.FXML
    private Button handleDiscountButton;
    @javafx.fxml.FXML
    private Button launchorEndStorePromotionsButton;
    @javafx.fxml.FXML
    private Button ManageStoreInventoryButton;

    public Button getProcessProductReturnsButton() {
        return processProductReturnsButton;
    }

    @Override
    public String toString() {
        return "RetailManagerDashboard{" +
                "processProductReturnsButton=" + processProductReturnsButton +
                ", approveCustomerOrdersButton=" + approveCustomerOrdersButton +
                ", monitorDailyStoreSalesButton=" + monitorDailyStoreSalesButton +
                ", scheduleStaffandAssignTasksButton=" + scheduleStaffandAssignTasksButton +
                ", generatePerformanceReportsButton=" + generatePerformanceReportsButton +
                ", handleDiscountButton=" + handleDiscountButton +
                ", launchorEndStorePromotionsButton=" + launchorEndStorePromotionsButton +
                ", ManageStoreInventoryButton=" + ManageStoreInventoryButton +
                '}';
    }

    public void setProcessProductReturnsButton(Button processProductReturnsButton) {
        this.processProductReturnsButton = processProductReturnsButton;
    }

    public Button getApproveCustomerOrdersButton() {
        return approveCustomerOrdersButton;
    }

    public void setApproveCustomerOrdersButton(Button approveCustomerOrdersButton) {
        this.approveCustomerOrdersButton = approveCustomerOrdersButton;
    }

    public Button getMonitorDailyStoreSalesButton() {
        return monitorDailyStoreSalesButton;
    }

    public void setMonitorDailyStoreSalesButton(Button monitorDailyStoreSalesButton) {
        this.monitorDailyStoreSalesButton = monitorDailyStoreSalesButton;
    }

    public Button getScheduleStaffandAssignTasksButton() {
        return scheduleStaffandAssignTasksButton;
    }

    public void setScheduleStaffandAssignTasksButton(Button scheduleStaffandAssignTasksButton) {
        this.scheduleStaffandAssignTasksButton = scheduleStaffandAssignTasksButton;
    }

    public Button getGeneratePerformanceReportsButton() {
        return generatePerformanceReportsButton;
    }

    public void setGeneratePerformanceReportsButton(Button generatePerformanceReportsButton) {
        this.generatePerformanceReportsButton = generatePerformanceReportsButton;
    }

    public Button getHandleDiscountButton() {
        return handleDiscountButton;
    }

    public void setHandleDiscountButton(Button handleDiscountButton) {
        this.handleDiscountButton = handleDiscountButton;
    }

    public Button getLaunchorEndStorePromotionsButton() {
        return launchorEndStorePromotionsButton;
    }

    public void setLaunchorEndStorePromotionsButton(Button launchorEndStorePromotionsButton) {
        this.launchorEndStorePromotionsButton = launchorEndStorePromotionsButton;
    }

    public Button getManageStoreInventoryButton() {
        return ManageStoreInventoryButton;
    }

    public void setManageStoreInventoryButton(Button manageStoreInventoryButton) {
        ManageStoreInventoryButton = manageStoreInventoryButton;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void viewApproveCustomerOrdersPanel(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G2_ApproveOrders.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G2_ApproveOrders");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewGeneratePerformanceReports(ActionEvent actionEvent) throws IOException{
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G8_Reports.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G8_Reports");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewProcessProductReturnsPanel(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G5_Returns.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G5_Returns");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewMonitorDailyStoreSalesPanel(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G1_DailySales.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G1_DailySales");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewScheduleStaffandAssignTasks(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G7_StaffSchedule.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G7_StaffSchedule");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewHandleDiscountPanel(ActionEvent actionEvent) throws IOException{
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G3_DiscountOverride.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G3_DiscountOverride");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewManageStoreInventoryPannel(ActionEvent actionEvent) throws IOException{
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G4_Inventory.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G4_Inventory");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }

    @javafx.fxml.FXML
    public void viewLaunchorEndStorePromotionsPanel(ActionEvent actionEvent) throws IOException {
        // Load FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("RM_G6_Promotions.fxml"));

        // Create Scene from FXML
        Scene scene = new Scene(fxmlLoader.load());

        // Create Stage
        Stage stage = new Stage();

        stage.setTitle("RM_G6_Promotions");

        // Set scene to stage
        stage.setScene(scene);

        // Show the Stage
        stage.show();
    }
}
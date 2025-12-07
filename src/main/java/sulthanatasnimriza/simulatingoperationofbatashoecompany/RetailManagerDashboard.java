package sulthanatasnimriza.simulatingoperationofbatashoecompany;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RetailManagerDashboard
{

    @javafx.fxml.FXML
    private Button processProductReturnsButton;

    public Button getProcessProductReturnsButton() {
        return processProductReturnsButton;
    }

    public void setProcessProductReturnsButton(Button processProductReturnsButton) {
        this.processProductReturnsButton = processProductReturnsButton;
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
    private Button approveCustomerOrdersButton;

    public RetailManagerDashboard(Button processProductReturnsButton, Button approveCustomerOrdersButton, Button monitorDailyStoreSalesButton, Button scheduleStaffandAssignTasksButton, Button generatePerformanceReportsButton, Button handleDiscountButton, Button launchorEndStorePromotionsButton, Button manageStoreInventoryButton) {
        this.processProductReturnsButton = processProductReturnsButton;
        this.approveCustomerOrdersButton = approveCustomerOrdersButton;
        this.monitorDailyStoreSalesButton = monitorDailyStoreSalesButton;
        this.scheduleStaffandAssignTasksButton = scheduleStaffandAssignTasksButton;
        this.generatePerformanceReportsButton = generatePerformanceReportsButton;
        this.handleDiscountButton = handleDiscountButton;
        this.launchorEndStorePromotionsButton = launchorEndStorePromotionsButton;
        ManageStoreInventoryButton = manageStoreInventoryButton;
    }

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

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void viewApplyCouponandMakePaymentPanel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewTrackOrderandRequestReturnPanel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewProvideShippingandContactDetailspanel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewsearchSpecificShoeModelPanel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void ViewChooseDeliveryorPickupOptionPannel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewAddProducttoCartButtonPanel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewBrowseShoesbyCategorypanel(ActionEvent actionEvent) {
    }

    @Deprecated
    public void viewProductDetailsandReviewsPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewApproveCustomerOrdersPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewGeneratePerformanceReports(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewProcessProductReturnsPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewMonitorDailyStoreSalesPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewScheduleStaffandAssignTasks(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewHandleDiscountPanel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewManageStoreInventoryPannel(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewLaunchorEndStorePromotionsPanel(ActionEvent actionEvent) {
    }
}
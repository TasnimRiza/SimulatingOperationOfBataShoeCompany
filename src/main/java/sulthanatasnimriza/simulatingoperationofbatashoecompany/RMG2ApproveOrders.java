package sulthanatasnimriza.simulatingoperationofbatashoecompany;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG2ApproveOrders
{
    @javafx.fxml.FXML
    private TableColumn orderStatusTC;
    @javafx.fxml.FXML
    private TableView orderStatusTV;
    @javafx.fxml.FXML
    private TableColumn DateTC;
    @javafx.fxml.FXML
    private TableColumn stockStatusTC;
    @javafx.fxml.FXML
    private ComboBox orderApproveOrRejectOB;
    @javafx.fxml.FXML
    private TextField orderIDTF;
    @javafx.fxml.FXML
    private ComboBox orderStatusOB;

    public TableColumn getOrderStatusTC() {
        return orderStatusTC;
    }

    @Override
    public String toString() {
        return "RMG2ApproveOrders{" +
                "orderStatusTC=" + orderStatusTC +
                ", orderStatusTV=" + orderStatusTV +
                ", DateTC=" + DateTC +
                ", stockStatusTC=" + stockStatusTC +
                ", orderApproveOrRejectOB=" + orderApproveOrRejectOB +
                ", orderIDTF=" + orderIDTF +
                ", orderStatusOB=" + orderStatusOB +
                ", orderIDTC=" + orderIDTC +
                ", paymentStatusTC=" + paymentStatusTC +
                ", orderDetailsTxtArea=" + orderDetailsTxtArea +
                '}';
    }

    public void setOrderStatusTC(TableColumn orderStatusTC) {
        this.orderStatusTC = orderStatusTC;
    }

    public TableView getOrderStatusTV() {
        return orderStatusTV;
    }

    public void setOrderStatusTV(TableView orderStatusTV) {
        this.orderStatusTV = orderStatusTV;
    }

    public TableColumn getDateTC() {
        return DateTC;
    }

    public void setDateTC(TableColumn dateTC) {
        DateTC = dateTC;
    }

    public TableColumn getStockStatusTC() {
        return stockStatusTC;
    }

    public void setStockStatusTC(TableColumn stockStatusTC) {
        this.stockStatusTC = stockStatusTC;
    }

    public ComboBox getOrderApproveOrRejectOB() {
        return orderApproveOrRejectOB;
    }

    public void setOrderApproveOrRejectOB(ComboBox orderApproveOrRejectOB) {
        this.orderApproveOrRejectOB = orderApproveOrRejectOB;
    }

    public TextField getOrderIDTF() {
        return orderIDTF;
    }

    public void setOrderIDTF(TextField orderIDTF) {
        this.orderIDTF = orderIDTF;
    }

    public ComboBox getOrderStatusOB() {
        return orderStatusOB;
    }

    public void setOrderStatusOB(ComboBox orderStatusOB) {
        this.orderStatusOB = orderStatusOB;
    }

    public TableColumn getOrderIDTC() {
        return orderIDTC;
    }

    public void setOrderIDTC(TableColumn orderIDTC) {
        this.orderIDTC = orderIDTC;
    }

    public TableColumn getPaymentStatusTC() {
        return paymentStatusTC;
    }

    public void setPaymentStatusTC(TableColumn paymentStatusTC) {
        this.paymentStatusTC = paymentStatusTC;
    }

    public TextArea getOrderDetailsTxtArea() {
        return orderDetailsTxtArea;
    }

    public void setOrderDetailsTxtArea(TextArea orderDetailsTxtArea) {
        this.orderDetailsTxtArea = orderDetailsTxtArea;
    }

    @javafx.fxml.FXML
    private TableColumn orderIDTC;
    @javafx.fxml.FXML
    private TableColumn paymentStatusTC;

    public RMG2ApproveOrders(TableColumn orderStatusTC, TableView orderStatusTV, TableColumn dateTC, TableColumn stockStatusTC, ComboBox orderApproveOrRejectOB, TextField orderIDTF, ComboBox orderStatusOB, TableColumn orderIDTC, TableColumn paymentStatusTC, TextArea orderDetailsTxtArea) {
        this.orderStatusTC = orderStatusTC;
        this.orderStatusTV = orderStatusTV;
        DateTC = dateTC;
        this.stockStatusTC = stockStatusTC;
        this.orderApproveOrRejectOB = orderApproveOrRejectOB;
        this.orderIDTF = orderIDTF;
        this.orderStatusOB = orderStatusOB;
        this.orderIDTC = orderIDTC;
        this.paymentStatusTC = paymentStatusTC;
        this.orderDetailsTxtArea = orderDetailsTxtArea;
    }

    @javafx.fxml.FXML
    private TextArea orderDetailsTxtArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void updateOrderStatusOnOrderStatusTable(ActionEvent actionEvent) {
    }
}
package sulthanatasnimriza.simulatingoperationofbatashoecompany;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class RMG7StaffSchedule
{
    @javafx.fxml.FXML
    private TextArea taskDescriptionTA;
    @javafx.fxml.FXML
    private TableColumn previousShiftTC;
    @javafx.fxml.FXML
    private TableColumn nameTC;
    @javafx.fxml.FXML
    private TableView employeeListTV;
    @javafx.fxml.FXML
    private TableColumn taskTC;
    @javafx.fxml.FXML
    private DatePicker dateDP;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TableColumn shiftTC;
    @javafx.fxml.FXML
    private TextField employeeIDTF;
    @javafx.fxml.FXML
    private TableColumn employeeIDTC;
    @javafx.fxml.FXML
    private TableColumn assignedEmployeeTC;
    @javafx.fxml.FXML
    private TextArea rosterTA;
    @javafx.fxml.FXML
    private TableColumn roleTC;

    public TextArea getTaskDescriptionTA() {
        return taskDescriptionTA;
    }

    public void setTaskDescriptionTA(TextArea taskDescriptionTA) {
        this.taskDescriptionTA = taskDescriptionTA;
    }

    public TableColumn getPreviousShiftTC() {
        return previousShiftTC;
    }

    @Override
    public String toString() {
        return "RMG7StaffSchedule{" +
                "taskDescriptionTA=" + taskDescriptionTA +
                ", previousShiftTC=" + previousShiftTC +
                ", nameTC=" + nameTC +
                ", employeeListTV=" + employeeListTV +
                ", taskTC=" + taskTC +
                ", dateDP=" + dateDP +
                ", dateTC=" + dateTC +
                ", shiftTC=" + shiftTC +
                ", employeeIDTF=" + employeeIDTF +
                ", employeeIDTC=" + employeeIDTC +
                ", assignedEmployeeTC=" + assignedEmployeeTC +
                ", rosterTA=" + rosterTA +
                ", roleTC=" + roleTC +
                ", scheduleTV=" + scheduleTV +
                ", messageLab=" + messageLab +
                '}';
    }

    public void setPreviousShiftTC(TableColumn previousShiftTC) {
        this.previousShiftTC = previousShiftTC;
    }

    public TableColumn getNameTC() {
        return nameTC;
    }

    public void setNameTC(TableColumn nameTC) {
        this.nameTC = nameTC;
    }

    public TableView getEmployeeListTV() {
        return employeeListTV;
    }

    public void setEmployeeListTV(TableView employeeListTV) {
        this.employeeListTV = employeeListTV;
    }

    public TableColumn getTaskTC() {
        return taskTC;
    }

    public void setTaskTC(TableColumn taskTC) {
        this.taskTC = taskTC;
    }

    public DatePicker getDateDP() {
        return dateDP;
    }

    public void setDateDP(DatePicker dateDP) {
        this.dateDP = dateDP;
    }

    public TableColumn getDateTC() {
        return dateTC;
    }

    public void setDateTC(TableColumn dateTC) {
        this.dateTC = dateTC;
    }

    public TableColumn getShiftTC() {
        return shiftTC;
    }

    public void setShiftTC(TableColumn shiftTC) {
        this.shiftTC = shiftTC;
    }

    public TextField getEmployeeIDTF() {
        return employeeIDTF;
    }

    public void setEmployeeIDTF(TextField employeeIDTF) {
        this.employeeIDTF = employeeIDTF;
    }

    public TableColumn getEmployeeIDTC() {
        return employeeIDTC;
    }

    public void setEmployeeIDTC(TableColumn employeeIDTC) {
        this.employeeIDTC = employeeIDTC;
    }

    public TableColumn getAssignedEmployeeTC() {
        return assignedEmployeeTC;
    }

    public void setAssignedEmployeeTC(TableColumn assignedEmployeeTC) {
        this.assignedEmployeeTC = assignedEmployeeTC;
    }

    public TextArea getRosterTA() {
        return rosterTA;
    }

    public void setRosterTA(TextArea rosterTA) {
        this.rosterTA = rosterTA;
    }

    public TableColumn getRoleTC() {
        return roleTC;
    }

    public void setRoleTC(TableColumn roleTC) {
        this.roleTC = roleTC;
    }

    public TableView getScheduleTV() {
        return scheduleTV;
    }

    public void setScheduleTV(TableView scheduleTV) {
        this.scheduleTV = scheduleTV;
    }

    public Label getMessageLab() {
        return messageLab;
    }

    public void setMessageLab(Label messageLab) {
        this.messageLab = messageLab;
    }

    public RMG7StaffSchedule(){

    }

    @javafx.fxml.FXML
    private TableView scheduleTV;
    @javafx.fxml.FXML
    private Label messageLab;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveAndAssignEmployeeintheScheduleTable(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveRosterandShowintheTextArea(ActionEvent actionEvent) {
    }
}
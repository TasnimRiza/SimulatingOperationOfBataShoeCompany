package sulthanatasnimriza.simulatingoperationofbatashoecompany;

import javafx.event.ActionEvent;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class RMG8Report
{
    @javafx.fxml.FXML
    private Button generateReportBtn;
    @javafx.fxml.FXML
    private TextArea reportSummaryTA;
    @javafx.fxml.FXML
    private LineChart summaryChart;
    @javafx.fxml.FXML
    private ComboBox reportTypeCB;

    @Override
    public String toString() {
        return "RMG8Report{" +
                "generateReportBtn=" + generateReportBtn +
                ", reportSummaryTA=" + reportSummaryTA +
                ", summaryChart=" + summaryChart +
                ", reportTypeCB=" + reportTypeCB +
                '}';
    }

    public Button getGenerateReportBtn() {
        return generateReportBtn;
    }

    public void setGenerateReportBtn(Button generateReportBtn) {
        this.generateReportBtn = generateReportBtn;
    }

    public TextArea getReportSummaryTA() {
        return reportSummaryTA;
    }

    public void setReportSummaryTA(TextArea reportSummaryTA) {
        this.reportSummaryTA = reportSummaryTA;
    }

    public LineChart getSummaryChart() {
        return summaryChart;
    }

    public void setSummaryChart(LineChart summaryChart) {
        this.summaryChart = summaryChart;
    }

    public ComboBox getReportTypeCB() {
        return reportTypeCB;
    }

    public void setReportTypeCB(ComboBox reportTypeCB) {
        this.reportTypeCB = reportTypeCB;
    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    public RMG8Report(Button generateReportBtn) {
        this.generateReportBtn = generateReportBtn;
    }

    @javafx.fxml.FXML
    public void printReport(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generateAndExportPDF(ActionEvent actionEvent) {
    }
}
package Lesson2_OpenClosedPrinciple.Example3.ProblematicCode;

public class ReportGenerator {

    public String GenerateReport(String reportType) {
        if (reportType.equals("PDF")) {
            return "Generating PDF Report";
        } else if (reportType.equals("Word")) {
            return "Generating Word Report";
        }
        return "Report type not supported";
    }
}

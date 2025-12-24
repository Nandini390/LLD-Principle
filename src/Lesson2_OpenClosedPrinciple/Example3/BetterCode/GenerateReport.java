package Lesson2_OpenClosedPrinciple.Example3.BetterCode;

import Lesson2_OpenClosedPrinciple.Example1.BetterCode.Notification;

import java.util.List;

public class GenerateReport {
    public void Generate(List<ReportGenerator> reports){
        for(ReportGenerator report: reports){
            report.generate();
        }
    }
}

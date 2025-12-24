package Lesson1_SRP.Example2.ProblematicCode;

public class Employee {

    private int id;

    public int getId(){
        return this.id;
    }

    public String fetchBioData(){
        return "Some bio data";
    }

    public double calculateSalary(){
        return 0;
    }

    public void printPerformanceData(){
        System.out.println("some performance related data");
    }

}


//There are multiple reasons to change the code of this class
//1. adding new attributes which leads to adding new getter and setters
//2. calculateSalary method algorithm can change


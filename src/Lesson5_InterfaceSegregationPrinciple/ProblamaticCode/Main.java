package Lesson5_InterfaceSegregationPrinciple.ProblamaticCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List<User> users= new ArrayList<>();
        // If the user is an instance of buyer or seller then it will throw exception, here we have to check if user is an instance of Admin then only call approve products.
       // users.approveProducts();
    }
}

package Lesson3_abstractClasses_and_Interface.AbstractClassDemo;

public abstract class Product {
    // An abstract method
    public abstract double calculateDiscount();

    // concrete method
    public void termsAndCondition() {
        System.out.println("Some terms");
    }
}

package Pattern1.BetterCode.V3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setBrand("Apple");
        b.setName("Iphone");
        b.setPrice(1000);

        Product p = new Product(b);
    }
}

//The builder class is solving the problem of constructor
//And the Product class is solving the problem of Validation.

//This solution is simplest form of Design Pattern called as BUILDER DESIGN PATTERN.
//DESIGN PATTERN:- Design Pattern are a kind of Coding solution prepared for a Object Oriented Programming Problem.
// BDP lies in the category of CREATIONAL DESIGN PATTERN that deals with the problems in the classes when the objects are getting created.

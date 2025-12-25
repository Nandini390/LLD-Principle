package Pattern1.BetterCode.V1;

public class Main {
    public static void main(String[] args) {
        Product p= new Product();
        p.setName("IPhone");
        p.setDesc("THis is an iphone");
        p.setBrand("Apple");
        p.setCategory("Mobile");
        p.setPrice(1000);
        // ...
    }
}


//Benefit:
//1. The code is more readable, managable, extendible.

// Issue:
//How to validate before object creation.
//It won't work with the immutable objects.
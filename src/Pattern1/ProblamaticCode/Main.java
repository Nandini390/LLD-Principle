package Pattern1.ProblamaticCode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product p = new Product("Iphone", "This is an Iphone", 1000, "Apple", "Mobile", 10, "2022-09-09", "2022-09-09", new ArrayList<>());
    }
}

//problem :-
//1. When we create an object, we carefully have to remember the order of the arguments. Making the code not maintainable.
//2. What if we want to have optional arguments. We will be forced to give some default values in the constructor with the current code.

//Benefits:-
// Validation of the object is easily doable with the constructor.

//The problem for optional arguments can be easily solved by Constructor overloading.
// -> But it will create 2 new problems:
// 1. CONSTRUCTOR EXPLOSION: suppose we have 4 attributes, then we can have 2^4=16 possible constructor
// 2. It is hard to maintain, suppose we have 2 properties, then we created 4 constructor, then when we want to add new properties then we have to create new constructor and may modify the existing one.
// 3. A few constructor will cause issue, like constructor with same order and same signature:
//ex :- Product(String name, String desc, int price)    &      Product(String name, String brand, int price)

package Lesson3_abstractClasses_and_Interface.AbstractClassDemo;

public class Main {

    public static void main(String[] args){
        //    Product p = new Product();
        Product p= new Macbook();
        p.termsAndCondition();

        Product p2=new LenovoLaptop();
        p2.termsAndCondition();
    }
}

package Pattern1.BetterCode.V4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                .setName("Iphone")
                .setPrice(1000)
                .setBrand("Apple")
                .setDesc("New apple iphone")
                .setCategory("Mobile")
                .build();
    }
}


//In SpringBoot there is an Annotation @Builder
//If we add this annotation on any class, it will by default create a builder instance out of it.
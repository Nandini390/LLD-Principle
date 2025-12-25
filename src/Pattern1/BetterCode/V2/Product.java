package Pattern1.BetterCode.V2;

import java.util.HashMap;
import java.util.List;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Product(HashMap<String, Object> mp) {
        if(mp.get("price").equals(0)) {
//            this.price = mp.get("price");
        }
    }
}


//Problem of bloated constructor also solved and validation also done inside the constructor before creation of the object.

//Issues:
// 1. What if in HashMap their is a spelling mistake in the property.
// 2. What if HashMap do not have a property as a Key.




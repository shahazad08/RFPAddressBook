package learnHashmap;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String, Product> productsByName = new HashMap<>();
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");

        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);
        System.out.println("1st Bike"+eBike);
        System.out.println("roadBike"+roadBike);

        //Get
        Product nextPurchase = productsByName.get("E-Bike");
        System.out.println("Reterieve the next Purchase"+nextPurchase);

        // Get key with the Null
        Product nextPurchaseNew = productsByName.get("Car");
        System.out.println("Reterieve the next Purchase"+nextPurchaseNew);

        Product newEBike = new Product("E-Bike", "A bike with a better battery");
        productsByName.put(newEBike.getName(), newEBike);
        System.out.println(productsByName.get("E-Bike").getDescription());


        // Storing the Null Key
        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
        productsByName.put(null, defaultProduct);
        System.out.println(defaultProduct);
        //Reteriving the Null key.
        Product nextPurchaseItem = productsByName.get(null);
        System.out.println("At least buy chocolate"+nextPurchaseItem.getDescription());

// Values with the Same Key
        productsByName.put(defaultProduct.getName(), defaultProduct);
        System.out.println("Value with the Same Key..."+productsByName);

        // Remove a Value
        productsByName.remove("E-Bike");
        System.out.println("Remove a Value"+productsByName.get("E-Bike"));

        // Iterating the Hash Map
        for(String key : productsByName.keySet()) {
            Product product = productsByName.get(key);
        }
    }


}

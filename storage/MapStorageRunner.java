package java_oop.lesson9_10.storage;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class MapStorageRunner {
    public static void main(String[] args) {
        Storage<Product, Long> productStorage = new MapStorage<>();

        productStorage.save(new Product(11, "MacBook", "Apple's notebook", 2000));
        productStorage.save(new Product(15, "Lenovo", "Lenovo's notebook", 1500));

        System.out.println(productStorage);
        productStorage.deleteById(11L);

        System.out.println("After removing by ID: " + productStorage);

        Optional<Product> product = productStorage.findById(15L);
        if(product.isPresent()){
            System.out.println("After filter: " + product.get());
        }
    }
}

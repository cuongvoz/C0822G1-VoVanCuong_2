package ss12_java_collection_framework.exercise.exercise_1.service;

import ss12_java_collection_framework.exercise.exercise_1.model.Product;

import java.util.Comparator;

public class Sort implements Comparator<Product> {

    public int compare(Product product1, Product product2) {
        if (product1.getPrice() > product2.getPrice()) {
            return 1;
        }
        return -1;
    }
}

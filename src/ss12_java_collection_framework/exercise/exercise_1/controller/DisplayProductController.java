package ss12_java_collection_framework.exercise.exercise_1.controller;

import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;
import ss12_java_collection_framework.exercise.exercise_1.model.Product;
import ss12_java_collection_framework.exercise.exercise_1.service.ChoiceProduct;

public class DisplayProductController {
    public static void displayProduct() {
        for (Product product : ListProduct.arrayList) {
            System.out.println(product);
        }
        ChoiceProduct.choiceProduct();
    }
}

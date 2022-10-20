package ss12_java_collection_framework.exercise.exercise_1.service;

import ss12_java_collection_framework.exercise.exercise_1.model.ListProduct;

public class RandomIdClass {
    public static void getRandomId() {
        for (int i = 0; i < ListProduct.arrayList.size(); i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            ListProduct.arrayList.get(i).setId(randomInt);
        }
    }
}

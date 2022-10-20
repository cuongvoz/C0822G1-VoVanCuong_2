package ss12_java_collection_framework.exercise.exercise_1.model;

import java.util.ArrayList;

public class ListProduct {
    static public ArrayList<Product> arrayList = new ArrayList();
    static {
        Product product1 = new Product("Gà",1000);
        Product product2 = new Product("Chó",2200);
        Product product3 = new Product("Khỉ",2400);
        Product product4 = new Product("Cá",1500);
        Product product5 = new Product("Hổ",3000);
        Product product6 = new Product("Rắn",1950);
        arrayList.add(product1);
        arrayList.add(product2);
        arrayList.add(product3);
        arrayList.add(product4);
        arrayList.add(product5);
        arrayList.add(product6);
    }
}

package ss12_java_collection_framework.practice.practice_1;

import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map< Integer,String> treeMap = new TreeMap<>();
        treeMap.put(21,"Cường");
        treeMap.put(25,"Sỹ");
        treeMap.put(28,"Minh");
        treeMap.put(23,"Phúc");
        treeMap.put(23,"thắng");
        for (Map.Entry key : treeMap.entrySet()) {
            System.out.printf("%s - %s\n",key.getKey(),key.getValue());
        }
    }
}


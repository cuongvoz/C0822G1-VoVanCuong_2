package ss12_java_collection_framework.practice.practice_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestMap {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        Map<Integer,Student> hashMap = new HashMap<>();
        hashMap.put(55,student1);
        hashMap.put(22,student2);
        hashMap.put(10,student3);

        for (Map.Entry key : hashMap.entrySet()) {
            System.out.println(key);
        }

        Set<Student> setMap = new HashSet<Student>();
        setMap.add(student2);
        setMap.add(student1);
        setMap.add(student3);

        for (Student item : setMap) {
            System.out.println(item);
        }
    }
}

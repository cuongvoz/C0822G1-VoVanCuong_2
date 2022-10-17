package ss10_dsa_list.practice.practice_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(2);
        listInteger.add(5);
        int i = 0;
        while (i <  listInteger.getLength()) {
            System.out.println("element of index "+ i + " = " + listInteger.get(i));
            i++;
        }
    }
}

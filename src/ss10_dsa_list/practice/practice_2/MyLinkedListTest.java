package ss10_dsa_list.practice.practice_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(53);
        ll.addFirst(43);

        ll.add(2,9);
        ll.add(4,87);
        ll.printList();
    }
}

package ss10_dsa_list.practice.practice_2;

public class MyLinkedList {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        // temp = array[0]
        Node holder;
        // i < 5-1 && array[i+1] != null;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
            // array[i] = array[i+1]
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.next;
        }
    }
}

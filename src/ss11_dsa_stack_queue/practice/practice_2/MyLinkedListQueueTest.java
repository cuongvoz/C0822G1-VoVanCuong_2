package ss11_dsa_stack_queue.practice.practice_2;

public class MyLinkedListQueueTest {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(12);
        queue.enqueue(5);
        queue.enqueue(87);
        queue.enqueue(34);
        queue.enqueue(23);
        queue.enqueue(56);
        queue.enqueue(77);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}

package ss10_dsa_list.practice.practice_1;

import java.util.Arrays;

public class MyList<E> {
    private static int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCap();
        }
        elements[size++] = e;
    }
    public int getLength(){
        return elements.length-2;
    }
    public E get(int index) {
       if (index >= size || index < 0) {
           throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
       }
       return (E) elements[index];
    }
    public void ensureCap(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}

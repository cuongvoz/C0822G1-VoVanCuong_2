package ss10_dsa_list.exercise.exercise_1;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity " + capacity);
        }
    }
    public void remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IllegalArgumentException("Error index " + index);
        } else {
            for (int i = index; i < size;i++) {
                elements[i] = elements[i + 1];
            }
                elements[size] = null;
                size--;

            }
        }

    public MyArrayList<E> clone(){
        MyArrayList<E> v = new MyArrayList<>();
        v.elements = Arrays.copyOf(elements,size);
        v.size = this.size;
        return v;

    }
    public boolean contains(E element) {
        return this.indexOf(element) >= 0;
    }
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return index;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public int size() {
        return this.size;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity " + minCapacity);
        }
    }

    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public boolean add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("Index : " + index);
        } else if (elements.length == size()) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
        return true;
    }

    public E get(int index) {
        return (E) elements[index];
    }

}

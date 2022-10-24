package ss14_algorithm_sort.practice.practice_1;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        int i = 0;
        do {
            int j = 0;
            while (j < array.length - 1) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                j++;
            }
            i++;
        } while (i < array.length);
        return array;
    }

    public static void main(String[] args) {
        int[] array = {12, 4, 3, 9, 7, 16, 8, 1};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}

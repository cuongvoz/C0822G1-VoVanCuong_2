package ss14_algorithm_sort.practice.practice_3;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {12, 4, 3, 9, 7, 16, 8, 1};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] selectionSort(int[] array) {
        int min;
        int index = 0;
        for (int i = 0 ; i < array.length;i++) {
            min = array[i];
            for (int j = i;j < array.length;j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[index] = temp;
        }
        return array;
    }
}

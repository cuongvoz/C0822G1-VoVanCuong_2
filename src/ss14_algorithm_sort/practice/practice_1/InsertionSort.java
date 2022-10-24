package ss14_algorithm_sort.practice.practice_1;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {12, 4, 3, 9,11, 7, 16, 8, 1};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static int[] insertionSort(int[] array) {
        for (int i = 1;i < array.length;i++) {
            for (int j = i; j >= 1;j--) {
                if (array[j] < array[j-1]) {
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

package ss13_algorithm_search.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {23, 54, 87, 66, 32, 54, 5654, 43, 23};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("Nhập số : ");
        System.out.println(binarySearch(array, scanner.nextInt(), 0, array.length - 1));
    }

    static int binarySearch(int[] array, int key, int low, int highs) {
        if (low < highs) {
            int middle = (low + highs) / 2;
            if (array[middle] == key) {
                return middle;
            }
            if (key > array[middle]) {
                return binarySearch(array, key, middle + 1, highs);
            }
            return binarySearch(array, key, low, middle - 1);
        }
        return -1;
    }
}

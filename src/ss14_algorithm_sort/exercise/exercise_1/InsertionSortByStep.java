package ss14_algorithm_sort.exercise.exercise_1;

import java.util.Arrays;

public class InsertionSortByStep {

    public static void main(String[] args) {
        int[] array = {9,8,7,6,10,11,1};
        int step = 1;
        System.out.println("Mảng lúc đầu là " + Arrays.toString(array));
        int i;
        for (i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i -1; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            if (i != j) {
                if (array[j+1] == key) {
                    System.out.println("Bước " + step + ": vì " + array[j+1] + " lơn hơn " + array[j] + " nên giữ nguyên");
                    step++;
                } else {
                    System.out.print("Bước " + step + ": chèn " + key + " vào trước " + array[j+1]);
                    array[j + 1] = key;
                    System.out.println(" mảng lúc này là " + Arrays.toString(array));
                    step++;
                }
            }
        }
        System.out.println("Mảng cuối cùng là " + Arrays.toString(array));
    }
}


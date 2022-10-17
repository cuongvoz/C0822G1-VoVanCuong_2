package ss9_automated_testing_tdd.exercise.exercise_3;

import java.util.Scanner;

public class FizzBuzzTranslateTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        for (int i = 0; i < 100;i++) {
            FizzBuzzTranslate.fizzBuzzTranslate(i);
        }
    }

}

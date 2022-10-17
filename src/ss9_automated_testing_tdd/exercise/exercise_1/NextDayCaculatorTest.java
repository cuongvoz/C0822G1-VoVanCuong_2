package ss9_automated_testing_tdd.exercise.exercise_1;

import java.util.Scanner;

public class NextDayCaculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day/month/year");
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        NextDayCaculator.nextDayCaculator(day,month,year);
    }

}

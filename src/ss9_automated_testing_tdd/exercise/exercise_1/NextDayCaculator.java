package ss9_automated_testing_tdd.exercise.exercise_1;

public class NextDayCaculator {
    public static void nextDayCaculator(int day, int month, int year) {
        if (day < 1 || day > 31) {
            System.out.println("Day is not available");
        } else if (month < 1 || month > 12) {
            System.out.println("Month is not available");
        } else if (year < 1000|| year > 3000) {
            System.out.println("Year is not available");
        } else if (day > 0 && day < 31 && month > 0 && month <= 12 && year > 1000 && year < 3000) {
            if (day < 31 && day > 0) {
                day++;
            } else if (day == 31 && month < 12 & month > 0) {
                month++;
                day = 1;
            }
            if (month == 12 && day == 31) {
                year++;
                day = 1;
                month = 1;
            }
            System.out.println(day + "/" + month + "/" + year);
        }

    }
}

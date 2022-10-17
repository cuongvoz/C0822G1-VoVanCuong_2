package ss9_automated_testing_tdd.exercise.exercise_3;

public class FizzBuzzTranslate {
    public static void fizzBuzzTranslate(int number) {
        boolean fizz = number % 3 == 0;
        boolean buzz = number % 5 == 0;
        boolean fizzBuzz = fizz && buzz;
        if (fizzBuzz) {
            System.out.println("FizzBuzz");
        } else if (buzz) {
            System.out.println("Buzz");
        } else if (fizz) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
    }
}

package ss2_loop_java.practice;

import java.util.Scanner;

public class CheckPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a primes");
        } else {
           int i = 1;
           int cout = 0;
           while (i <= number) {
               if (number % i == 0) {
                   cout++;
               }
               i++;
            }
            if (cout == 2) {
                System.out.println(number + " is a primes");
            } else {
                System.out.println(number + " is not a primes");
            }
        }
    }
}


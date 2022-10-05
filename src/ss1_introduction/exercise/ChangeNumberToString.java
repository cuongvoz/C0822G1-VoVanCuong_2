package ss1_introduction.exercise;

import java.util.Scanner;

public class ChangeNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String hundreds = null;
        String tens = null;
        String units = null;
        if (number >= 0 && number <= 10) {
            switch (number / 1) {
                case 0:
                    tens = "Zero";
                    break;
                case 1:
                    tens = "One";
                    break;
                case 2:
                    tens = "Two";
                    break;
                case 3:
                    tens = "Three";
                    break;
                case 4:
                    tens = "Four";
                    break;
                case 5:
                    tens = "Five";
                    break;
                case 6:
                    tens = "Six";
                    break;
                case 7:
                    tens = "Seven";
                    break;
                case 8:
                    tens = "Eight";
                    break;
                case 9:
                    tens = "Nine";
                    break;
                case 10:
                    tens = "Ten";
                    break;
            }
            System.out.println(tens);
        } else if (number > 10 && number <= 20) {
            switch (number) {
                case 11:
                    tens = "Eleven";
                    break;
                case 12:
                    tens = "Twelve";
                    break;
                case 13:
                    tens = "Thirteen";
                    break;
                case 14:
                    tens = "Fourteen";
                    break;
                case 15:
                    tens = "Fifteen";
                    break;
                case 16:
                    tens = "Sixteen";
                    break;
                case 17:
                    tens = "Seventeen";
                    break;
                case 18:
                    tens = "Eighteen";
                    break;
                case 19:
                    tens = "Nineteen";
                    break;
                case 20:
                    tens = "Twenty";
                    break;
            }
            System.out.print(tens);
        } else if (number > 20 && number < 100) {
            switch (number / 10) {
                case 0:
                    tens = " ";
                    break;
                case 1:
                    tens = "Ten";
                    break;
                case 2:
                    tens = "Twenty";
                    break;
                case 3:
                    tens = "Thirty";
                    break;
                case 4:
                    tens = "Forty";
                    break;
                case 5:
                    tens = "Fifty";
                    break;
                case 6:
                    tens = "Sixty";
                    break;
                case 7:
                    tens = "Seventy";
                    break;
                case 8:
                    tens = "Eighty";
                    break;
                case 9:
                    tens = "Ninety";
                    break;
            }
            switch (number % 10) {
                case 0:
                    units = "";
                    break;
                case 1:
                    units = "One";
                    break;
                case 2:
                    units = "Two";
                    break;
                case 3:
                    units = "Three";
                    break;
                case 4:
                    units = "Four";
                    break;
                case 5:
                    units = "Five";
                    break;
                case 6:
                    units = "Six";
                    break;
                case 7:
                    units = "Seven";
                    break;
                case 8:
                    units = "Eight";
                    break;
                case 9:
                    units = "Nine";
                    break;
            }
            System.out.println(tens + " " + units);
        } else if (number >= 100 && number < 1000) {
            switch (number / 100) {
                case 1:
                    hundreds = "One hundred ";
                    break;
                case 2:
                    hundreds = "Two hundred ";
                    break;
                case 3:
                    hundreds = "Three hundred ";
                    break;
                case 4:
                    hundreds = "Four hundred ";
                    break;
                case 5:
                    hundreds = "Five hundred ";
                    break;
                case 6:
                    hundreds = "Six hundred ";
                    break;
                case 7:
                    hundreds = "Seven hundred ";
                    break;
                case 8:
                    hundreds = "Eight hundred";
                    break;
                case 9:
                    hundreds = "Nine hundred ";
                    break;
            }
//            } int area = number / 10;
            if (number % 100 < 20) {
                switch (number % 100) {
                    case 0:
                        tens = "";
                        break;
                    case 1:
                        tens = "One";
                        break;
                    case 2:
                        tens = "Two";
                        break;
                    case 3:
                        tens = "Three";
                        break;
                    case 4:
                        tens = "Four";
                        break;
                    case 5:
                        tens = "Five";
                        break;
                    case 6:
                        tens = "Six";
                        break;
                    case 7:
                        tens = "Seven";
                        break;
                    case 8:
                        tens = "Eight";
                        break;
                    case 9:
                        tens = "Nine";
                        break;
                    case 10:
                        tens = "Ten";
                        break;
                    case 11:
                        tens = "Eleven";
                        break;
                    case 12:
                        tens = "Twelve";
                        break;
                    case 13:
                        tens = "Thirteen";
                        break;
                    case 14:
                        tens = "Fourteen";
                        break;
                    case 15:
                        tens = "Fifteen";
                        break;
                    case 16:
                        tens = "Sixteen";
                        break;
                    case 17:
                        tens = "Seventeen";
                        break;
                    case 18:
                        tens = "Eighteen";
                        break;
                    case 19:
                        tens = "Nineteen";
                        break;
                    default:
                        tens = "";
                }
                if (number % 100 == 0) {
                    System.out.println(hundreds);
                } else {
                    System.out.println(hundreds + " and " + tens);
                }
            }
        } else {
            int area = number / 10;
            switch (area % 10) {
                case 0:
                    tens = "Zero";
                    break;
                case 1:
                    tens = "Ten";
                    break;
                case 2:
                    tens = "Twenty";
                    break;
                case 3:
                    tens = "Thirty";
                    break;
                case 4:
                    tens = "Forty";
                    break;
                case 5:
                    tens = "Fifty";
                    break;
                case 6:
                    tens = "Sixty";
                    break;
                case 7:
                    tens = "Seventy";
                    break;
                case 8:
                    tens = "Eighty";
                    break;
                case 9:
                    tens = "Ninety";
                    break;
                default:
                    tens = "";
            }
            int ones = number % 100;
            switch (ones % 10) {
                case 0:
                    units = "Zero";
                    break;
                case 1:
                    units = "One";
                    break;
                case 2:
                    units = "Two";
                    break;
                case 3:
                    units = "Three";
                    break;
                case 4:
                    units = "Four";
                    break;
                case 5:
                    units = "Five";
                    break;
                case 6:
                    units = "Six";
                    break;
                case 7:
                    units = "Seven";
                    break;
                case 8:
                    units = "Eight";
                    break;
                case 9:
                    units = "Nine";
                    break;
            }
            System.out.println(hundreds + " and " + tens + " " + units);
        }

    }
}




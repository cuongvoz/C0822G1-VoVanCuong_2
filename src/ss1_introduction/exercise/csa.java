package ss1_introduction.exercise;

public class csa {
    public static void main(String[] args) {
        System.out.println(" Multiplication Table");

        //Display the number title
        System.out.print(" ");
        for (int j = 1; j <= 9; j++)
            System.out.print(" " + j);

        System.out.println("\n———————————————————————————————————————");

        //Display table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", (j + " x " + i + " = "  + (i * j)));
            }
            System.out.println();
        }
    }
}
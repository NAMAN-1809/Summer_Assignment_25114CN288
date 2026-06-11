package day10;

import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {

        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        int stars = (2 * rows) - 1;
        int spaces = 0;

        for (int i = 1 ; i <= rows; i++) {

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }

        sc.close();
    }
}

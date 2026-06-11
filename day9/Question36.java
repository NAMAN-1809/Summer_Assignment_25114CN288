package day9;

import java.util.Scanner;

public class Question36 {
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

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {

                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

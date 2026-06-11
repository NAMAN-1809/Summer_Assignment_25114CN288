package day9;

import java.util.Scanner;

public class Question34 {
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

        for (int i = rows; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}

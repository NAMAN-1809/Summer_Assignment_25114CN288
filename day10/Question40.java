package day10;

import java.util.Scanner;

public class Question40 {
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

            char ch = 'A';

            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }

            ch -=2;
            for (int j = i - 1; j > 0; j--) {
                System.out.print(ch);
                ch--;
            }
            System.out.println();
        }

        sc.close();
    }
}

package day9;

import java.util.Scanner;

public class Question35 {
    public static void main(String[] args) {

        int rows;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        rows = sc.nextInt();
        char ch = 'A';

        if (rows <= 0) {
            System.out.println("Invalid input.");
            sc.close();
            return;
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }

        sc.close();
    }
}

package day05;

import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Perfect Number must be greater than 1.");
            sc.close();
            return;
        }

        int sum = 0;
        for (int i = 1;  i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            System.out.println("The given number is a Perfect Number.");
        }
        else {
            System.out.println("The given number is NOT a Perfect Number.");
        }

        sc.close();
    }
}

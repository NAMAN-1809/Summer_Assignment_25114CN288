package day04;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int digits = 0;
        int temp = num;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        int sum = 0;
        temp = num;
        while (temp != 0) {

            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        }
        else {
            System.out.println(num + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
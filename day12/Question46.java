package day12;

import java.util.Scanner;

public class Question46 {

    public static boolean isArmstrong(int n) {

        int temp = n;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == n;
    }


    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("Armstrong number.");
        }
        else {
            System.out.println("NOT an Armstrong number.");
        }

        sc.close();
    }
}

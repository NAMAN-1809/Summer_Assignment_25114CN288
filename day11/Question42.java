package day11;

import java.util.Scanner;

public class Question42 {

    public static int max(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        int max = max(num1, num2);
        System.out.println("The maximum number is: " + max);
        sc.close();
    }
}

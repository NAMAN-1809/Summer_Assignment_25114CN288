package day11;

import java.util.Scanner;

public class Question41 {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        int result = sum(num1, num2);
        System.out.println("The sum is: " + result);
        sc.close();
    }
}

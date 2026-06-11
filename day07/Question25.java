package day7;

import java.util.Scanner;

public class Question25 {

    public static long factorial(int n) {

        if (n < 0) {
            System.out.println("Input should be a positive integer");
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        long result = factorial(num);
        System.out.println("Factorial of " + num + " is : " + result);
        sc.close();
    }
}

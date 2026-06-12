package day12;

import java.util.Scanner;

public class Question47 {

    public static long fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }


    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Fibonacci term: ");
        num = sc.nextInt();

        long result = fibonacci(num);
        System.out.println("The " + num + "th Fibonacci term is: " + result);
        sc.close();
    }
}

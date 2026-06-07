package day7;

import java.util.Scanner;

public class Question26 {

    public static long fibonacci(int n){

        if(n == 0) {
            return 0;
        }

        if(n == 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        num = sc.nextInt();

        System.out.println("The Fibonacci series is :");
        for (int i = 0; i <= num - 1 ; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}

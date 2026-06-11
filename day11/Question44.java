package day11;

import java.util.Scanner;

public class Question44 {

    public static long factorial(int n){

        if (n < 0) {
            System.out.println("Input should be greater than 0");
            return 0;
        }

        long fact = 1;
        for (int i = 1; i <= n; i++){
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
        sc.close();
    }
}

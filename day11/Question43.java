package day11;

import java.util.Scanner;

public class Question43 {

    public static boolean isPrime(int n) {

        if  (n <= 1) {
            System.out.println("Input should be greater than 1");
            return false;
        }

        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not Prime number");
        }

        sc.close();
    }
}

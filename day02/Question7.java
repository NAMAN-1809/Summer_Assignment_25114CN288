package day02;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int product = 1;
        while (num != 0) {
            int digit = num % 10;
            product *= digit;
            num /= 10;
        }

        System.out.println("The product of the digits is " + product);
        sc.close();
    }
}

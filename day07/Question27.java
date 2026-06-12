package day07;

import java.util.Scanner;

public class Question27 {

    public static int digitSum(int n) {

        if  (n < 0) {
            n = -n;
        }

        if (n < 10) {
            return n;
        }

        int digit = n % 10;
        n = n /10;

        return digit + digitSum(n);
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int sum = digitSum(num);
        System.out.println("The sum of digits of " + num + " is : " + sum);
        sc.close();
    }
}

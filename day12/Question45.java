package day12;

import java.util.Scanner;

public class Question45 {

    public static boolean isPalindrome(int n) {

        if (n < 0) {
            return false;
        }

        int num = n;
        int rev = 0;
        while (n != 0) {
            rev = (rev * 10) + n % 10;
            n /= 10;
        }

        return rev == num;
    }


    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("The number is a Palindrome.");
        }
        else {
            System.out.println("The number is NOT a Palindrome.");
        }

        sc.close();
    }
}

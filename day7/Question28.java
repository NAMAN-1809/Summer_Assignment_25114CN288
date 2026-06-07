package day7;

import java.util.Scanner;

public class Question28 {

    public static int reverse(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        int digit = n % 10;
        rev = rev * 10 + digit;
        n = n / 10;

        return reverse(n, rev);
    }

    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int revNum = reverse(num, 0);
        System.out.println("The reversed number is : " + revNum);
        sc.close();
    }
}

package day2;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int revNum = 0;
        while(num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }

        System.out.println("The reverse number is: " + revNum);
        sc.close();
    }
}

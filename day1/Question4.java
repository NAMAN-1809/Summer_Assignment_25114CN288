package day1;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        int num;        //assuming number to be int
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }

        System.out.println("Digits: " + digits);
        sc.close();
    }
}

package day1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of N numbers is: " + sum);
        sc.close();
    }
}

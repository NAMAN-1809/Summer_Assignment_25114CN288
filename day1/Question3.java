package day1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: "); //the num should be +ve
        num = sc.nextInt();

        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
        sc.close();
    }
}

package day05;

import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int sum = 0;
        int temp = num;
        while (temp != 0) {

            int digit = temp % 10;
            int factorial = 1;
            for (int i = 1; i<= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        }
        else {
            System.out.println(num + " is NOT a Strong number.");
        }

        sc.close();
    }
}

package day4;

import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Fibonacci term: ");
        num = sc.nextInt();

        int a = 0, b = 1;

        if (num <= 0) {
            System.out.println("Please enter a position greater than 0.");
        }
        else if (num == 1) {
            System.out.println("The 1st Fibonacci term is: " + a);
        }
        else if (num == 2) {
            System.out.println("The 2nd Fibonacci term is: " + b);
        }
        else {
            for (int i = 1; i <= num - 2; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("The " + num + "th Fibonacci term is: " + b);
        }

        sc.close();
    }
}
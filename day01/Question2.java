package day1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        System.out.println("The multiplication table of " + num + " is :");

        for(int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " * " + i + " = " + product);
        }

        sc.close();
    }
}

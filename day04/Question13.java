package day04;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        num = sc.nextInt();

        int a = 0, b = 1;
        if (num <= 0) {
            System.out.print("Please enter a number greater than 0.");
        }
        else if (num == 1) {
            System.out.println("The Fibonacci Series for " + num + " terms is :");
            System.out.print(a);
        }
        else {
            System.out.println("The Fibonacci Series for " + num + " terms is :");
            System.out.print(a + " " + b + " ");
            for(int i =1 ; i <= num-2; i++) {
                int temp = a + b;
                a = b;
                b = temp;
                System.out.print(b + " ");
            }
        }

        sc.close();
    }
}

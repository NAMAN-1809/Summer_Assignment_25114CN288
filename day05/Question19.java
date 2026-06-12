package day05;

import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        System.out.println("The factors of " + num + " are :");
        for (int i = 1; i <= num/2; i++) {
            if (num % i ==0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(num + " .");
        sc.close();
    }
}

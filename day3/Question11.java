package day3;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {

        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("The GCD is : " + num1);
        sc.close();
    }
}

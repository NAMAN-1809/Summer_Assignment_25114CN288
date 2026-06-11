package day3;

import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {

        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        //for lcm we use the formula lcm = (a*b)/gcd
        int a = num1, b = num2;
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;

        int lcm;
        if (num1 == 0 || num2 == 0){
            lcm = 0;
        }
        else{
            lcm = (num1/gcd)*num2;
        }

        System.out.println("The LCM is: " + lcm);
        sc.close();
    }
}

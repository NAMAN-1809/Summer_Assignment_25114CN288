package day06;

import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {

        int power;
        float base;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and power according to x^n");
        System.out.print("Enter base: ");    //can accept int and float
        base = sc.nextFloat();
        System.out.print("Enter power: ");   //only works for int
        power = sc.nextInt();

        if (power < 0) {
            base = 1 / base;
            power = -power;
        }

        float result = 1;
        while (power > 0) {

            if (power % 2 == 0) {
                base *= base;
                power /= 2;
            }
            else {
                result *= base;
                power -= 1;
            }
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
}

package day06;

import java.util.Scanner;

public class Question22 {
    public static void main(String[] args) {

        long binary;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number: ");
        binary = sc.nextLong();

        long temp = binary;
        int num = 0;
        int posMultiplier = 1;
        boolean isValidBinary = true;

        while (temp != 0) {
            int remainder = (int) (temp % 10);

            if (remainder <0 || remainder > 1) {
                System.out.println("Entered positive binary number is INVALID (should only contain 0 & 1).");
                sc.close();
                return;
            }

            num += remainder * posMultiplier;
            posMultiplier *= 2;
            temp /= 10;
        }

        System.out.println("The decimal of " + binary + " is : " + num);
        sc.close();
    }
}

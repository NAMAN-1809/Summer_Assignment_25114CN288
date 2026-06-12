package day06;

import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int temp = num;
        long binary = 0;
        long posMultiplier = 1;

        while (temp != 0) {
            int remainder = temp % 2;
            binary += remainder * posMultiplier;
            posMultiplier *= 10;
            temp /= 2;
        }

        System.out.println("The binary of " + num + " is : " + binary);
        sc.close();
    }
}

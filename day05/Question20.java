package day05;

import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Entered number should be greater than 1.");
            sc.close();
            return;
        }

        int temp = num;
        int maxPrime = -1;

        while (temp % 2 == 0) {
            maxPrime = 2;
            temp /= 2;
        }

        for (int i = 3; i * i <= temp; i += 2) {
            if (temp % i == 0) {
                maxPrime = i;
                temp /= i;
            }
        }

        if (temp > 2){
            maxPrime = temp;
        }

        System.out.println("The largest prime factor of " + num + " is : " + maxPrime);
        sc.close();
    }
}

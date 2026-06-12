package day12;

import java.util.Scanner;

public class Question48 {

    public static boolean isPerfect(int n) {

        if (n <= 1) {
            System.out.println("Perfect Number must be greater than 1.");
            return false;
        }

        int sum = 0;
        for (int i = 1;  i <= n/2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }


    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = sc.nextInt();

        if (isPerfect(num)) {
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not Perfect Number");
        }

        sc.close();
    }
}

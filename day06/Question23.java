package day06;

import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int temp = num;
        int count = 0;
        while (temp != 0) {
            if  (temp % 2 != 0) {
                count += 1;
            }
            temp /= 2;
        }

        System.out.println("The number of set bit in " + num + " is : " + count);
        sc.close();
    }
}

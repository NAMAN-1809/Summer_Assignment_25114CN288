package day04;

import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {

        int initialNum,finalNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        initialNum = sc.nextInt();
        System.out.print("Enter the final number: ");
        finalNum = sc.nextInt();

        System.out.println("Armstrong numbers in range " +  initialNum + " and " + finalNum + " is :");

        for (int i = initialNum; i <= finalNum; i++) {

            if (i < 0) continue;

            int digits = 0;
            int temp = i;
            while (temp != 0) {
                temp /= 10;
                digits++;
            }

            int sum = 0;
            temp = i;
            while (temp != 0) {

                int digit = temp % 10;
                int power = 1;
                for (int j = 1; j <= digits; j++) {
                    power *= digit;
                }
                sum += power;

                if (sum > i) {
                    break;
                }

                temp /= 10;
            }

            if (temp ==0 && sum == i){
                System.out.println(i);
            }
        }

        sc.close();
    }
}

package day03;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        int initialNum,finalNum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial number: ");
        initialNum = sc.nextInt();
        System.out.print("Enter the final number: ");
        finalNum = sc.nextInt();

        System.out.println("Prime numbers in range " + initialNum + " to " + finalNum);
        for (int i = initialNum; i <= finalNum; i++) {
            int factors = 0;
            for (int j = 2; j <= i/2 ; j++) {
                if (i % j  == 0) {
                    factors++;
                }
            }
            if (factors == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}

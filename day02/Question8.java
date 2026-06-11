package day2;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args){

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int revNum = 0;
        int tempNum = num;
        while(tempNum != 0) {
            int digit = tempNum % 10;
            revNum = revNum * 10 + digit;
            tempNum /= 10;
        }

        if (revNum == num){
            System.out.println("The given number is a palindrome.");
        }
        else{
            System.out.println("The given number is not a palindrome.");
        }
        sc.close();
    }
}

package day3;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        int factors = 0;
        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0) {
                factors++;
            }
        }

        if (factors == 0){
            System.out.println("The given number is Prime.");
        }
        else{
            System.out.println("The given number is not Prime.");
        }
        sc.close();
    }
}

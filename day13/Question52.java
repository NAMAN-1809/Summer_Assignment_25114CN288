package day13;

import java.util.Scanner;

public class Question52 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input. Number of elements must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[num];
        int oddCount = 0;
        int evenCount = 0;

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < num; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("Number of Even elements: " + evenCount);
        System.out.println("Number of Odd elements: " + oddCount);

        sc.close();
    }
}

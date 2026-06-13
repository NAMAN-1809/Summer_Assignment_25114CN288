package day13;

import java.util.Scanner;

public class Question51 {
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
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < num; i++) {

            arr[i] = sc.nextInt();

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest element is " + smallest);
        System.out.println("Largest element is " + largest);

        sc.close();
    }
}

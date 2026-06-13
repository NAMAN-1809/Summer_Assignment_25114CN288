package day13;

import java.util.Scanner;

public class Question49 {
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

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array :");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}

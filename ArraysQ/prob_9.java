package ArraysQ;
// Program to print the elements of an array

import java.util.Scanner;

public class prob_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}

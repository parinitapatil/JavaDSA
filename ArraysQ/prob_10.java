package ArraysQ;
//Program to print the elements of an array in reverse order

import java.util.Scanner;

public class prob_10 {
    //reverse array
    static void reversearray(int[] arr) {
        int n = arr.length;
        for (int i = n; i > 0; i--) {
            System.out.print(arr[i-1]+" ");
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reversearray(arr);
    }
}

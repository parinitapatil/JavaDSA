package ArraysQ;
//Program to print the largest element in an array

import java.util.Scanner;

public class prob_11 {
    //largest element method
    static void largestele(int[] arr) {
        int n = arr.length;
        int maxEle = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                maxEle = arr[i];

            }
        }
        System.out.println(maxEle);
    }


    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        largestele(arr);
    }
}

package ArraysQ;
//Q. Program to print the duplicate elements of an array.

import java.util.Scanner;

public class prob_12 {
    //duplicate element array method
    static void duplicateEle(int[] arr) {
        int n = arr.length;
        boolean hasDuplicate = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[j]);
                    hasDuplicate = true;
                    break;
                }
            }
        }
        if (!hasDuplicate) {
            System.out.println("No Duplicate found.");
        }
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
        duplicateEle(arr);
    }
}

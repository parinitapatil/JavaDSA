package ArraysQ;

import java.util.Scanner;

public class prob_6 {
    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void squareofsortedArray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] > arr[right] ) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //size 
        System.out.println("Enter size of an Array:");
        int n = sc.nextInt();

        //array
        System.out.println("Enter "+n+" elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Updated Arrays:");
        squareofsortedArray(arr);
    }
}

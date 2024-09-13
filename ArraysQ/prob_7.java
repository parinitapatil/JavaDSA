package ArraysQ;

import java.util.Scanner;

public class prob_7 {
    static int[] prefixsum(int[] arr) {
        int n = arr.length;
        // int sum = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = prefixsum(arr);
        System.out.println("Prefix sum array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

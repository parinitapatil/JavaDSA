package ArraysQ;

import java.util.Scanner;

public class prob_14 {
    //largest element array method
    static void largestEle(int[] arr) {
        int n = arr.length;
        int lar = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                lar = arr[i];
            }
        }
        System.out.println("Largest Element in array is "+lar);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        largestEle(arr);
    }
}

package ArraysQ;

import java.util.Scanner;

public class prob_15 {
    //second largest element in an array
    //method
    static void secondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found");
        } 
        else {
            System.out.println("The second largest element is: " + second_largest);
        }
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
        secondLargest(arr);
    }
}

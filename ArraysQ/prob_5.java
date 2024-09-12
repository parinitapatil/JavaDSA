package ArraysQ;

import java.util.Scanner;

public class prob_5 {
    //swap method
    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //sorted array method
    static void sortarrayparity(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }

            if (arr[left] % 2 == 0) {
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
    }
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //size of an array
        System.out.println("Enter array size: ");
        int n = sc.nextInt();

        //array
        int[] arr = new int[n];
        System.out.println("Enter "+ n +" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        //call method
        System.out.println("Sorted Array:");
        sortarrayparity(arr);
    }
}

package ArraysQ;

public class prob_1 {
    public static void main(String[] args) {
        // Calculate the sum of element of a given array
        int sum = 0;
        int arr[] = { 1, 2, 3 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        
    }
}

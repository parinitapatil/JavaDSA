package ArraysQ;

public class prob_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 9, 10, 6 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}

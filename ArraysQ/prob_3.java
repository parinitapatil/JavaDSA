package ArraysQ;

public class prob_3 {
    public static void main(String[] args) {
        // search element
        int[] arr = { 1, 3, 5, 7 };
        int x = 5;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}

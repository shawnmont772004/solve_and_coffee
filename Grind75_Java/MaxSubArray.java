public class MaxSubArray {
    public int max(int m, int n) {
        if (m == n) {
            return m;
        } else if (m > n) {
            return m;
        } else {
            return n;
        }
    }

    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 2, -4, 3, -2, 5, 1, -2, 1, -6 };

        int curr_sum = 0;
        int max_sub = 0;

        MaxSubArray m = new MaxSubArray();
        for (int i = 0; i < arr.length; i++) {
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            curr_sum += arr[i];
            max_sub = m.max(curr_sum, max_sub);
        }

        System.out.println("The maximum subarray sum is:" + max_sub);
    }
}

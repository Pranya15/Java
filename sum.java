public class sum {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 4, 2};
        int k = 3;
        int sum = 0;
        int n = arr.length;

        // First window sum
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int maxsum = sum;

        // Sliding window
        for (int i = k; i < n; i++) {
            maxsum = maxsum + arr[i] - arr[i - k];
            if (maxsum > sum) {
                sum = maxsum;
            }
        }

        System.out.println(sum);
    }
}

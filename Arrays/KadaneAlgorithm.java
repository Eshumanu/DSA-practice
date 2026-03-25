package Arrays;

public class KadaneAlgorithm {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = arr[0];
        int curSum = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            curSum = Math.max(arr[i], curSum + arr[i]);
            maxSum = Math.max(maxSum, curSum);
        }

        System.out.println("Maximum subarray is" + maxSum);
    }

}

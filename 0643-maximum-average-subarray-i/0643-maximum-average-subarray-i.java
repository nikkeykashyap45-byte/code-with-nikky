class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // First window ka sum
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Window ko slide karna
        for (int i = k; i < nums.length; i++) {

            windowSum += nums[i];       // new element add
            windowSum -= nums[i - k];   // old element remove

            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
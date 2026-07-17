class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int ans = 0;

        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {

                int length = end - start + 1;

                if (length % 2 == 1) {

                    if (start == 0)
                        ans += prefix[end];
                    else
                        ans += prefix[end] - prefix[start - 1];
                }
            }
        }

        return ans;
    }
}
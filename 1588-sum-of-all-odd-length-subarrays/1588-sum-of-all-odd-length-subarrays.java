class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            int csum=0;
            for(int j=i;j<n;j++){
                csum+=arr[j];
                if((j-i+1)%2==1) sum+=csum;
            }
        }
        return sum;
    }
}
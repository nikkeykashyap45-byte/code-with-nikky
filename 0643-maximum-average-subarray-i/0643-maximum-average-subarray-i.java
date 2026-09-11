class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int windowsum = 0;
        double maxaverage = Double.NEGATIVE_INFINITY;
        for(int right=0;right<nums.length;right++){
            windowsum+=nums[right];
            if(right-left+1==k){
                double average = (double) windowsum/k;
                maxaverage = Math.max(maxaverage,average);
                windowsum-=nums[left];
                left++;
            }
        }
        return maxaverage;
    }
}
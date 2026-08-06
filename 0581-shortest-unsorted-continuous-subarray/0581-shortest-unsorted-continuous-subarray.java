class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        int left = 0;
        int right = nums.length-1;
        while(left<nums.length && nums[left]==sorted[left]){
            left++;
        }
        while(right>left && nums[right]==sorted[right]){
            right--;
        }
        return right-left+1;
    }
}
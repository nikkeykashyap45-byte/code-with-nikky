class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res= new int[n];
        int i = 0;
        int j = n-1;
        int k = n-1;
        while(i<=j){
            int leftsqr=nums[i]*nums[i];
            int rightsqr=nums[j]*nums[j];
            if(leftsqr>rightsqr){
                res[k]=leftsqr;
                i++;
            }
            else{
                res[k]=rightsqr;
                j--;
            }
            k--;
        }
        return res;
    }
}
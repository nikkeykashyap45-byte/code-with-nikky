class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        HashSet <Integer> resultset = new HashSet<>();
        for(int num:nums2){
            if(set.contains(num)){
                resultset.add(num);
            }
        }
        int [] result = new int[resultset.size()];
        int i = 0;
        for(int num:resultset){
            result[i]=num;
            i++;
        }
        return result;
    }
}
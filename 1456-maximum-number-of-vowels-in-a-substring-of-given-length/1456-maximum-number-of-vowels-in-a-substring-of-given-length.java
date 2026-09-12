class Solution {
    public int maxVowels(String s, int k) {
        int left = 0;
        int vowelcount = 0;
        int maxvowel = 0;
        for(int right=0;right<s.length();right++){
            if(isVowel(s.charAt(right))){
                vowelcount++;
            }
            if(right-left+1==k){
                maxvowel = Math.max(maxvowel,vowelcount);
                if(isVowel(s.charAt(left))){
                    vowelcount--;
                }
                left++;
            }
        }
        return maxvowel;
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
}
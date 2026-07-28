class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int length = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                set.remove(ch);
                length +=2;
            }
            else{
                set.add(ch);
            }
        }
        if(!set.isEmpty()){
            length += 1;
        }
        return length;
    }
}
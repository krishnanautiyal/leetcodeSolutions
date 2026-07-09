class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0, right=0, max=0;
        Set<Character> set = new HashSet();
        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                int len = right-left;
                max= Math.max(max,len);
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}

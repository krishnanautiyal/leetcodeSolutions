class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int[] lps = new int[s.length()];
        int i=1, j=0;
        while(i<s.length()){
            if(s.charAt(i)== s.charAt(j)){
                lps[i]=j+1;
                i++;
                j++;
            }
            else{
                if(j!=0) j=lps[j-1];
                else i++;
            }
        }
        int diff = s.length() - lps[s.length()-1];
      if(diff!=s.length()){
        if(s.length()%diff==0) return true;
      }
      return false;
    }
}

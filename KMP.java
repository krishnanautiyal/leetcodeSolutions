class Solution{
  public int strStr(String haystack, String needle){
    if(needle.length()==0) return 0;

    int[] lps = lps(needle);
    int i=0,j=0;

    while(i<haystack.length()){
      if(haystack.charAt(i)==needle.charAt(j)){
        i++;
        j++;
      }
      if(j==needle.length()) return i-j;
      else if(i < haystack.length() && haystack.charAt(i) != needle.charAt(j)){
        if(j!=0) j = lps[j-1];
        else i++;
    }
  
  }
  return -1;}


  public int[] lps(String needle){
  int[] lps = new int[needle.length()];
  int i=1;
  int j=0;
    while(i<needle.length()){
      if(needle.charAt(i)== needle.charAt(j)){
        lps[i] = j+1;
        i++;
        j++;
      }
      else{
        if(j!=0) j= lps[j-1];
        else i++;
    }
  }
  return lps;
}}

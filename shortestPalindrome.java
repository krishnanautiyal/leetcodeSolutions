class Solution{
  public String shortestPalindrome(String s) {
    String snew = new StringBuilder(s).reverse().toString()+"$"+s;

    int[] lps = new int[snew.length()];
    int i=1,j=0;
    while(i<snew.length()){
      if(snew.charAt(i)==snew.charAt(j)){
        lps[i] = j+1;
        i++;
        j++;
      }
      else{
        if(j!=0) j= lps[j-1];
        else i++;
      }
    }
    return new StringBuilder(s.substring(lps[snew.length()-1])).reverse().toString() +s;
  }
}

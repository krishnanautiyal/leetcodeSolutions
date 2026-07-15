class Solution{
  public String lagrestPrefix(String[] strs){
// we take the first string's first character and compare it with every other string, and incrementing them all together
    for(int i=0; i< strs[0].length(); i++){
      
      char ch = strs[0].charAt(i);
      for(int j=0; j< strs.length; j++){
        if(i==strs[j].length() || strs[j].charAt(i)!=ch)
           return strs[0].substring(0,i);
      }
    }
    return strs[0];
  }
}

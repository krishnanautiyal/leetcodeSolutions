class Solution {
    public boolean isPalindrome(int x) {
         String s = String.valueOf(x);
         StringBuilder sb = new StringBuilder(s).reverse();
         String si=sb.toString();

         if(s.equals(si)){ return true;}
         else {return false;}
         
    }
}
class Solution{
  public int[] plusOne(int[] digits){
    for(int i= digits.length; i>=0; i--){
      // starting from left any element less than 9 add 1 and return, if not then it only can be 9, make the current 0 in that case and find next non 9 element and increment,
      // if not found , it means all elements are 9, and a new element is required to be added, increase the array size and set the first element as one, the previous has already been set to zero by the loop
      if(digits[i]<10) {digits[i]++;
         return digits;}
      digits[i]=0;
    }
    int[] arr = new int[digits.length+1];
    arr[0]=1;
    return arr;
  }
}

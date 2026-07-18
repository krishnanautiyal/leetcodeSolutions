class Solution{
  public int missing(int[] nums){
    int n = nums.length;
    int SUM= (n*(n+1))/2;
    int sum=0;
    for(int i:nums)
        sum+=i;
    return SUM-sum;
  }
}

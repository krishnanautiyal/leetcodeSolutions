class Solution{
  public int searchIndex(int[] nums, int target){
  for(int i=0; i<nums.length; i++){
    if(nums[i]==target) return i;
    else if(nums[i]>target) return i;
  }
    else return nums.length;
  }
}

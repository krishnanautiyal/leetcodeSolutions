class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's algo
        int curr=nums[0];
        int sum=nums[0];
        for(int i=1; i<nums.length;i++){
            curr= Math.max(nums[i], nums[i]+curr);
            sum = Math.max(sum,curr);
        }
        return sum;
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int write=1;
        //starting with index 1, as the first index element is always unique.

        for(int read=1; read<nums.length; read++)   
            if(nums[read]!=nums[read-1]) 
                nums[write++]=nums[read];

        return write;
    }

}

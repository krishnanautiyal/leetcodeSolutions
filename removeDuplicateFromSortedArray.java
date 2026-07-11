class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int right = 1;

        for (int left = 1; left < nums.length; left++) {
            if (nums[left] != nums[left - 1]) {
                nums[right] = nums[left];
                right++;
            }
        }

        return right;
    }
}

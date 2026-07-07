class Solution {
    public int majorityElement(int[] nums) {
        // boyre-moore majority vote algo
        int can=0;
        int con=0;

        for(int i=0; i<nums.length; i++){
            if(con==0){ can=nums[i];
            con=1;}
            else if(can == nums[i]) con++;
            else con--;
        }
        con=0;
        for(int i:nums){
            if(i==can) con++;
        }
        if(con>nums.length/2) return can;

        return -1;
    }
}

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int can1=0, can2=0;
        int con1=0, con2=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==can1) con1++;
            else if(nums[i]==can2) con2++;
            else if(con1==0){
                can1=nums[i];
                con1=1;
            }
            else if(con2==0){
                can2=nums[i];
                con2=1;
            }
            
            else {
                con1--;
                con2--;
            }
        }
        con1=0;
        con2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==can1) con1++;
            else if( nums[i]==can2) con2++;
        }

        List<Integer> result = new ArrayList<>();
        if(con1>nums.length/3)
        result.add(can1);
        if(con2>nums.length/3)
        result.add(can2);
        return result;
    }
}

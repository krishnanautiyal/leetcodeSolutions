class Solution {
    public int subarraySum(int[] nums, int k) {
        // two pointers fail for negative input values
        // use prefix sum and map
        Map<Integer,Integer> map = new HashMap();
        int sum=0,count=0;
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);

            map.put(sum, map.getOrDefault(sum,0)+1);
        }
            return count;
    }
}

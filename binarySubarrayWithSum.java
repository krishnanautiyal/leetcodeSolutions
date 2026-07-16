class Solution{
  public int binarySubarraySum(int[] nums, int goal){
    int count=0;
    int sum=0;
    Map<Integer,Integer> map = new HashMap<>();
    map.put(0,1);
    // initialize the map with the 0,1 
    // update the prefix sum and subtract goal from it 
    // if the diff already exist on the map, it is the number of subarrays we can obtain from removing the current element
    // so add the value of the difference
    // and update the frequency
    for(int num: nums){
      sum+=num;
      int diff = sum - goal;
      if(map.containsKey(diff))
          count+=map.get(diff);
      map.put(sum, map.getOrDefault(sum,0)+1);
    }
    return count;
  }
}

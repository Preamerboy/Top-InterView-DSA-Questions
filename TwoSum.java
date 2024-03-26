// Link -https://leetcode.com/problems/two-sum
//Code 
class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> hs=new HashMap();
       for(int i=0;i<nums.length;i++){
        int sum=target-nums[i];
        if(hs.containsKey(sum)){
            return new int [] {i,hs.get(sum)};
        }
        hs.put(nums[i],i);
       }
       return new int []{};
    }
}

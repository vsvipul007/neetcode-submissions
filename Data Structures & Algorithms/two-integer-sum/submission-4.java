class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        //int [] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                // res[0] = map.get(x);
                // res[1] = i;
                // return res;
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

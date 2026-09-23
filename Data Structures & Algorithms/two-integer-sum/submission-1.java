class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res= {0,0};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i];
            if(map.containsKey(target-x)){
                res[1] = i;
                res[0] = map.get(target-x);
                return res;
            }
            map.put(x,i);
        }
        return res;
    }
}

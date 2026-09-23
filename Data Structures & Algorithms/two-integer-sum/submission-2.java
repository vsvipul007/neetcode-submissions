class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i];
            if(map.containsKey(target-x)){
                // res[1] = i;
                // res[0] = map.get(target-x);
                // return res;
                return new int[] {map.get(target-x),i};
            }
            map.put(x,i);
        }
        return new int[0];
    }
}

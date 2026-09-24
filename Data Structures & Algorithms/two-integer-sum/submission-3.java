class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int [] res = new int[2];
        for(int i=0;i<nums.length;i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
                res[0] = map.get(x);
                //System.out.println("index of x- "+ map.get(x));
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}

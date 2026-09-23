class Solution {
    public boolean hasDuplicate(int[] nums) {
        // HashMap<Integer, Integer> mp = new HashMap<>();
        // for(int x : nums)
        // {
        //     if(mp.containsKey(x)) return true;
        //     mp.put(x,1);
        // }
        // return false;
        // Better version with hashSet
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums)
        {
            if(set.add(x)==false){
                return true;
            }
        }
        return false;
    }
}
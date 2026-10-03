class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
            // if(mp.containsKey(num)){
            //     mp.put(num,mp.get(num)+1);
            // }
            // else{
            //     mp.put(num,1);
            // }
        }
        List<List<Integer>> freq_pairs = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            List<Integer> pair = new ArrayList<>();
            pair.add(entry.getValue());
            pair.add(entry.getKey()); 
            freq_pairs.add(pair); 
        }
        freq_pairs.sort((a,b) -> Integer.compare(b.get(0),a.get(0)));
        for(int i=0;i<k;i++)
        {
            res[i] = freq_pairs.get(i).get(1);
        }
        return res;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Bucket Sort - Total no of elements =n, so a number cannot occur more than n times. 
        //We can create buckets - 0 to n (frequency as index) - Put the element into int's bucket - based on it's frequency
        //It can be List<Integer>[]. We traverse from the end (high freq index) and add elements till k reached.
        int n = nums.length;
        List<Integer> [] bucket = new List[n+1];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            int freq = entry.getValue();
            int elem = entry.getKey();
            if(bucket[freq] != null){
                bucket[freq].add(elem);
            } 
            else{
                // List<Integer> lst = new ArrayList<>();
                // lst.add(elem);
                bucket[freq] = new ArrayList<>(List.of(elem));
            }
        }
        int [] res = new int[k];
        int cnt = 0;
        for(int i=n; i>=0 && cnt < k; i--){
            if(bucket[i] == null){
                continue;
            }
            List<Integer> lst = bucket[i];
            for(int num : lst){
                if(cnt == k){
                    break;
                }
                res[cnt++] = num;
            }
        }
        return res;
    }
}

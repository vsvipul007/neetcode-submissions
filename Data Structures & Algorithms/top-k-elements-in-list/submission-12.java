class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //2D List solution was - O(n + mlogm) - O(n) for traversal/putting into map, mlogm - for sorting - m unique elements
        //We are using min-heap (Priority Queue - with array of 2 integers)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0])); 
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : nums)
        {
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :  mp.entrySet()){
            pq.add(new int[]{entry.getValue(), entry.getKey()});
            if(pq.size()>k){
                pq.poll(); //pq.remove();
            } 
        }
        int[] res = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            res[i++] = pq.poll()[1];
        }
        return res;
    }
}

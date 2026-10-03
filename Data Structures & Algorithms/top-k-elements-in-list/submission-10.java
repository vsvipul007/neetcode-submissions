class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //2D List solution was - O(n + mlogm) - O(n) for traversal/putting into map, mlogm - for sorting - m unique elements
        //We are using min-heap (Priority Queue - with elements as list of integer)
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.get(0), b.get(0))); 
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num:nums)
        {
            mp.put(num, mp.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry :  mp.entrySet()){
            pq.add(List.of(entry.getValue(),entry.getKey()));
            if(pq.size()>k){
                pq.poll(); //pq.remove();
            } 
        }
        int[] res = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            res[i++] = pq.poll().get(1);
        }
        return res;
    }
}

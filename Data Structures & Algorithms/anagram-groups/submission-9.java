class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            char [] sorted_s = str.toCharArray();
            Arrays.sort(sorted_s);
            String sorted_str = new String(sorted_s);
            // if(map.containsKey(sorted_str)){
            //     map.get(sorted_str).add(str);
            // }
            // else{
            //     List<String> list = new ArrayList<>();
            //     list.add(str);
            //     map.put(sorted_str,list);
            // }
            map.computeIfAbsent(sorted_str,k-> new ArrayList()).add(str);
        }
        // for(List<String> str : map.values()){
        //     res.add(str);
        // }
        return new ArrayList<>(map.values());
    }
}

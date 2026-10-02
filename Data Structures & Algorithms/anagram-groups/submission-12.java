class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for(String str : strs)
        {
            char[] sorted_str = str.toCharArray();
            Arrays.sort(sorted_str);
            String sorted = new String(sorted_str);
            if(mp.containsKey(sorted)){
                mp.get(sorted).add(str);
            }
            else {
                List<String> strlist = new ArrayList<>();
                strlist.add(str);
                mp.put(sorted,strlist);
            }
        }
        // for(List<String> strlist: mp.values())
        // {
        //     res.add(strlist);
        // }
        return new ArrayList<>(mp.values());
    }
}

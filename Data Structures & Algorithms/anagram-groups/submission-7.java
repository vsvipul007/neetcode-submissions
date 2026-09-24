class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char [] char_s = s.toCharArray();
            char [] sorted_s = s.toCharArray();
            Arrays.sort(sorted_s);
            String str = new String(char_s);
            String sorted_str = new String(sorted_s);
            if(map.containsKey(sorted_str)){
                List<List<String>> list = new ArrayList<>();
                map.get(sorted_str).add(str);
                //map.put(sorted_s, list);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(sorted_str,list);
            }
        }
        for(List<String> str : map.values()){
            res.add(str);
        }
        return res;
    }
}

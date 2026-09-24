class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char [] sorted_s = str.toCharArray();
            Arrays.sort(sorted_s);
            String sorted_str = new String(sorted_s);
            map.computeIfAbsent(sorted_str,k-> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

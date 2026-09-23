class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> mp = new HashMap<>();
        for(String str : strs)
        {
            char[] chararray = str.toCharArray();
            Arrays.sort(chararray);
            String sorted = new String(chararray);
            //mp.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
            List<String> slist = mp.get(sorted);
            if(slist== null){
                slist = new ArrayList<>();
                slist.add(str);
                mp.put(sorted,slist);
            }
            else slist.add(str);
        }
        List<List<String>> ans = new ArrayList<>();
        for(List<String> strList: mp.values()){
            ans.add(strList);
        }
        return ans;
    }
}

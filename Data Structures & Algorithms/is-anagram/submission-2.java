class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else {
                map.put(x,1);
            }
        }
        for(char x : t.toCharArray())
        {
            if(!map.containsKey(x)){
                return false;
            }
            else{
                map.put(x,map.get(x)-1);
            }
        }
        for(int x: map.values())
        {
            if(x!=0) return false;
        }
        return true;
    }
}

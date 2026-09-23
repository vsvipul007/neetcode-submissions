class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i=0;i<s.length();i++){
            count.merge(s.charAt(i),1,Integer::sum);
            count.merge(t.charAt(i),-1,Integer::sum);
        }
        for(int val : count.values())
        {
            if(val!=0) return false;
        }
        return true;
    }
}

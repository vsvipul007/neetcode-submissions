class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size()) return false;
        int len = s.size();
        unordered_map<char,int> mp;
        for(int i=0;i < len; i++)
        {
            mp[s[i]]++;
            mp[t[i]]--;
        }
        for(auto x: mp)
        {
            if(x.second != 0) return false;
        }
        return true;
    }
};

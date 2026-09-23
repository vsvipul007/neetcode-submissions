class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int l = 0, r=0;
        int len, max_len =0;
        unordered_map<char,int> mp;
        while(r<n)
        {
            char x = s[r];
            if(mp.find(x) != mp.end()){
                max_len = max(max_len,r-l);
                l = max(l,mp[x] + 1);
            }
                mp[x]= r;
                r++;
        }
        max_len = max(max_len,r-l);
        return max_len;
    }
};

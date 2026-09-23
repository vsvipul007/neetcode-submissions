class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> mp;
        int n = s.length();
        int i=0,j=0, max_len=0;
        while(j<n)
        {   
            if(mp.find(s[j]) != mp.end())
            {
                //cout<<"Repeated Character & index of j " <<s[j]<<" -- "<<j<<endl;
                max_len = max(j-i,max_len);
                //cout<<"Left Char & index before update - " << i << " && " <<s[i]<<endl;
                i = max(mp[s[j]]+1,i);
                //cout<<"Left Char & index after update - " << i << " && " <<s[i]<<endl;
            }
            mp[s[j]] = j;
            j++;
        }
        max_len = max(j-i,max_len);
        return max_len;
    }
};

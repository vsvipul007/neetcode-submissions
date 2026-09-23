class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int n = strs.size();
        vector<vector<string>> res;
        map<vector<int>,vector<string>> mp;

        for(int i=0;i<n;i++)
        {
            vector<int> freq(26,0);
            string str = strs[i];
            for(auto x: str)
            {
                freq[x-'a']++;
            }
            mp[freq].push_back(str);
        }
        for( auto x: mp)
        {
            res.push_back(x.second);
        }
        return res;
    }
};

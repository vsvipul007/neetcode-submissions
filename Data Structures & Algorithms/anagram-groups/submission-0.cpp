class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int n = strs.size();
        vector<vector<string>> res;
        map<string,vector<string>> mp;
        for(int i=0;i<n;i++)
        {
            string str = strs[i];
            sort(str.begin(),str.end());
            mp[str].push_back( strs[i]);
        }
        for( auto x: mp)
        {
            res.push_back(x.second);
        }
        return res;
    }
};

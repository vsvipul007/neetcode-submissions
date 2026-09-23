class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> ans;
        unordered_map<int,int> mp;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            mp[nums[i]]++;
        }
        vector<vector<int>> pairs;
        for(auto it : mp)
        {
            vector<int> tmp;
            tmp.push_back(it.second);
            tmp.push_back(it.first);
            pairs.push_back(tmp);
        }
        sort(pairs.begin(), pairs.end(), [](auto &a, auto &b){ return a[0] > b[0]; });
        for(int i=0;i<k;i++)
        {
            ans.push_back(pairs[i][1]);
        }        
        return ans;
    }
};

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
        vector<pair<int,int>> pairs;
        for(auto it : mp)
        {
            pairs.push_back({it.second, it.first});
        }
        sort(pairs.begin(), pairs.end(), greater<>());
        for(int i=0;i<k;i++)
        {
            ans.push_back(pairs[i].second);
        }        
        return ans;
    }
};

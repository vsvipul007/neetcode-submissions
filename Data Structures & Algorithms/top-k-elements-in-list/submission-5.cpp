class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int,int> mp;
        for(auto num: nums){
            mp[num]++;
        }
        vector<vector<int>> freq_map;
        for(auto num:mp)
        {
            freq_map.push_back({num.second, num.first});
        }
        sort(freq_map.begin(), freq_map.end(),greater<>());
        vector<int> res;
        for(int i=0;i<k;i++)
        {
            res.push_back(freq_map[i][1]);
        }
        return res;
    }
};

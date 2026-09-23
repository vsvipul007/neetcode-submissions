class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        vector<int> ans;
        //Bucket Sort
        int n = nums.size();
        unordered_map<int,int> mp;
        for(int i=0;i<n;i++)
        {
            mp[nums[i]]++;
        }
        vector<vector<int>> freq_bucket(n+1);
        for(auto it:mp)
        {
            freq_bucket[it.second].push_back(it.first);
        }
        for(int i = n; i>=0 && ans.size()<k; i--)
        {
             for(int x: freq_bucket[i])
             {
                ans.push_back(x);
                if(ans.size()==k) break;
             }
        }
        return ans;
    }
};

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mp;
        vector<int> res;
        int n = nums.size();
        for(int i=0;i<n;i++)
        {
            int rem = target - nums[i];
            if(mp.find(rem) != mp.end()){
                res.push_back(mp[rem]);
                res.push_back(i);
                break;
            }
            mp[nums[i]] = i;
        }
        return res;
    }
};

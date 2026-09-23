class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int x: nums)
        {
            if(mp.find(x) != mp.end()){
                return true;
            }
            mp[x] = 1;
        }
        return false;
    }
};
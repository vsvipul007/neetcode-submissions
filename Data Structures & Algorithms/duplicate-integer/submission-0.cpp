class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        set<int> unique_nums;
        for(int x: nums)
        {
            unique_nums.insert(x);
        }
        if(nums.size()==unique_nums.size()) return false;
        return true;
    }
};
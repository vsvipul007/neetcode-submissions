class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        int max_count = 0;
        unordered_set<int> mp;
        for(int i=0;i<n;i++)
        {
            mp.insert(nums[i]);
        }
        for(int i=0;i<n;i++)
        {
            int cnt =0;
            if(mp.find(nums[i]-1) != mp.end()){
                continue;
            }
            else{
                int curr = nums[i]+1;
                int count =1;
                while(mp.find(curr) != mp.end())
                {
                    curr++;
                    count++;
                }
                if(count>max_count) max_count = count;
            }
        }
        return max_count;
    }
};

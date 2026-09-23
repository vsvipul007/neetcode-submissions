class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        int n = nums.size();
        int max_len =0;
        for (int i=0;i<n;i++)
        {
            int current = nums[i];
            int count =0;
            while(find(nums.begin(),nums.end(),current) != nums.end())
            {
                current++;
                count++;
            }
            if(count > max_len ) max_len = count;            
        }
        return max_len;
    }
};

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        vector<vector<int>> ans;
        //[-4,-1,-1,0,1,2]
        for(int i=0;i<n;i++)
        {
            while(i>0 && nums[i]==nums[i-1]) i++; //To prevent repetition
            int x = -1*nums[i];
            int left = i+1;
            int right = n-1;
            while(left>=0 && right <n && left<right)
            {
                if(left<n-1 && nums[left]==nums[left+1]) left++; //To prevent repetition
                if(right>0 && nums[right]==nums[right-1]) right--; //To prevent repetition
                if(nums[left] + nums[right] == x) {
                    ans.push_back({nums[i], nums[left], nums[right]});
                    left++;
                    right--;
                }
                else if(nums[left] + nums[right] < x) left++;
                else right--;
            }
        }
        return ans;
    }
};

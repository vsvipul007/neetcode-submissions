class Solution {
public:
    int maxArea(vector<int>& heights) {
        int n= heights.size();
        int left = 0, right = n-1;
        int max_area = 0, area;
        while(left<right)
        {   
            area = (right-left)*min(heights[left],heights[right]);
            if(area>max_area) max_area = area;
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return max_area;
    }
};

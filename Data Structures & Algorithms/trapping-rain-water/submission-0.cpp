class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        vector<int> l_max(n,0);
        vector<int> r_max(n,0);
        l_max[0] = height[0];
        r_max[n-1] =height[n-1];
        int max = l_max[0];
        for(int i=1;i<n;i++)
        {
            if(height[i]>max) max = height[i];
            l_max[i] = max;
        }
        max = r_max[n-1];
        for(int i=n-2;i>=0;i--)
        {
            if(height[i]>max) max = height[i];
            r_max[i] = max; 
        }
        int ans =0;
        for(int i=0;i<n;i++)
        {
            cout<<" l_max[i]- "<<l_max[i] << " r_max[i] " << r_max[i] <<" height[i] "<<height[i]<<endl;
            ans += min(l_max[i],r_max[i]) - height[i];
        }
    return ans;
    }
};

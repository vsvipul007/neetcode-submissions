class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefix = new int[n];
        int [] suffix = new int[n];
        int [] result = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;
        int prefix_prod = 1, suffix_prod = 1;
        for(int i = 1; i<n; i++){
            prefix[i] = prefix_prod * nums[i-1];
            prefix_prod = prefix[i];
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix[i] = suffix_prod * nums[i+1];
            suffix_prod = suffix[i];
        }
        for(int i=0;i<n;i++)
        {
            result[i] = prefix[i] * suffix[i]; 
        }
        return result;

        // [1,2,4,6] -- []
        // [1,1,2,8] -- []
        // [48,24,6,1]
        // [48,24,12,8]
        

    }
}  

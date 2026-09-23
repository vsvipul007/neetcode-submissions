class Solution {
public:
    int hammingWeight(uint32_t n) {
        int count = 0;
        for(int i=0;i<32;i++)
        {
            int test_num = (1 << i);
            if (test_num & n) count++;
        }
        return count;
    }
};

class Solution {
public:
    bool isPalindrome(string s) {
        int len = s.length();
        string s2="";
        for(int i=0;i<len;i++)
        {
            if(s[i] >= 'A' &&  s[i] <= 'Z')
            {
                s2 += s[i] + 32;
            }
            else if(s[i]>='a' && s[i]<='z')
            {
                s2 += s[i];
            }
            else if(s[i]>='0' && s[i]<='9')
            {
                s2 += s[i];
            }
        }
        cout<<"s2--"<<s2<<endl;
        int left=0 , right = s2.length()-1;
        while(left < right)
        {
            if(s2[left] != s2[right]){
                return false;
            }
            left++, right--;
        }
        return true;
    }
};

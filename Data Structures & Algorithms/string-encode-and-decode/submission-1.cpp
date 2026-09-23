class Solution {
public:

    string encode(vector<string>& strs) {
        int n = strs.size();
        string encoded_string = "";
        for(int i=0;i<n;i++)
        {
            encoded_string += (to_string(strs[i].length()) + "#" + strs[i]) ; 
        }
        return encoded_string;
    }

    vector<string> decode(string s) {
        int len = s.length(), i =0;
        vector<string> res;
        while(i<len)
        {
            string str="";
            int s_len = 0;
            while(s[i]!='#')
            {
                s_len = s_len*10 + s[i]-'0';
                i++;
            }
            if(s[i]=='#')
            {
                i++;
                str = s.substr(i, s_len);
            }
            res.push_back(str);
            i = i+s_len;
        }
    
        return res;
    }
};

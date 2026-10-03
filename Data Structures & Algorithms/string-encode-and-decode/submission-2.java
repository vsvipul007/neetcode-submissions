class Solution {
    public String encode(List<String> strs) {
        String res = new String(); // String res = "";
        for(String str: strs)
        {
            res += str.length() + "#" + str ; 
        }
        return res;
    }
    //strs = ["Hello","World", "EnvironmentalStudies"]
    // str = 5#Hello5#World20#EnvironmentalStudies
    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int n = str.length();
        for(int i = 0;i<n;i++)
        {
            String num = "";
            while(str.charAt(i) != '#'){
                num += str.charAt(i);
                i++;
            }
            System.out.println("Num collected- " + num);
            int len = Integer.parseInt(num);
            String st = str.substring(i+1,i+1+len);
            i=i+len;
            res.add(st);
        }
        return res;
    }
}

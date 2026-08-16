class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder ans=new StringBuilder();
        char[] hex="0123456789abcdef".toCharArray();
        while(num!=0){
            int digit=num&15;
            ans.append(hex[digit]);
            num=num>>>4;
        }
        return ans.reverse().toString();
    }
}
class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n &&(s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;
        }
        long num=0;
        long limit=2147483647L;
        if(sign==-1){
            limit=2147483648L;
        }
        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit=s.charAt(i)-'0';
            if(num>(limit-digit)/10){
                if(sign==1){
                    return 2147483647;
                }else{
                    return -2147483648;
                }
            }
            num=num*10+digit;
            i++;
        }
        if(sign==-1){
            return(int)(-num);
        }else{
            return (int)num;
        }
    }
}
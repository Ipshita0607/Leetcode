class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int ssum=0;
        boolean b=false;
        while(n>0){
            int digit=n%10;
            dsum+=digit;
            ssum+=digit*digit;
            n/=10;
            if(ssum-dsum>=50){
                b= true;
            }else{
                b= false;
            }
        }
        return b;
    }
}
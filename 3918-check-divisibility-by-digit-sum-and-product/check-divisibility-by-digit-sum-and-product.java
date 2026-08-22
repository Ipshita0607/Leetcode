class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int val=n;
        while(n>0){
            int d=n%10;
            n/=10;
            sum+=d;
            product*=d;
        }
        return val%(sum+product)==0;
    }
}
class Solution {
    public int reverse(int x) {
        long reversed=0;
        while(x!=0){
            long ldigit=x%10;
            reversed=reversed*10+ldigit;
            if(reversed>Integer.MAX_VALUE||reversed<Integer.MIN_VALUE) 
            return 0;
            x/=10;
        }
        return (int) reversed;
    }
}
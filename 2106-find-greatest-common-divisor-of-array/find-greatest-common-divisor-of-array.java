class Solution {
    public int findGCD(int[] nums) {
         int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int ele:nums){
            if(ele<smallest) smallest=ele;
            if(ele>largest) largest=ele;
        }
        int gcd=1;
        for(int i=2;i<=smallest;i++){
        if(smallest%i==0 && largest%i==0){
            gcd=i;
        }
    }
    return gcd;  
    }
    
}
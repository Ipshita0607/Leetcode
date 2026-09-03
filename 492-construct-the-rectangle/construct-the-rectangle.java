class Solution {
    public int[] constructRectangle(int area) {
        int l=area;
        int w=1;
        for(int i=1;i*i<=area;i++){
            if(area%i==0){
                int l1=area/i;
                int w1=i;
                if(l1>=w1 &&(l-w)>(l1-w1)){
                    l=l1;
                    w=w1;
                }
            }
        }
        int[] ans=new int[2];
        ans[0]=l;
        ans[1]=w;
        return ans;
    }
}
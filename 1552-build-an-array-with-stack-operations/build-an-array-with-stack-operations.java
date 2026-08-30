class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String>ans=new ArrayList<>();
        int j=0;
        for(int num=1;num<=n&&j<target.length;num++){
            ans.add("Push");
            if(num==target[j]){
                j++;
            }else{
                ans.add("Pop");
            }
        }
        return ans;
    }
}
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        boolean[] found=new boolean[k+1];
        int count=0;
        int operations=0;
        for(int i=nums.size()-1;i>=0;i--){
            operations++;
            int x=nums.get(i);
            if(x<=k && !found[x]){
                found[x]=true;
                count++;
            }
            if(count==k){
                return operations;
            }
        }
        return operations;
    }
}
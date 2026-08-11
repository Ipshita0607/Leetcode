class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] have=new int[26];
        int[] need=new int[26];
        for(int i=0;i<s.length();i++){
            have[s.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++){
            need[target.charAt(i)-'a']++;
        }
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<26;i++){
                if(need[i]>0){
                    int copies=have[i]/need[i];
                    ans=Math.min(ans,copies);
                }
            }
        return ans;
    }
}
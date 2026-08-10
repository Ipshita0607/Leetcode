class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(int i=0;i<chars.length();i++){
            freq[chars.charAt(i)-'a']++;
        }
        int ans=0;
        for(String word:words){
            int[] need=new int[26];
            for(int i=0;i<word.length();i++){
                need[word.charAt(i)-'a']++;
            }
            boolean possible=true;
            for(int i=0;i<26;i++){
                if(need[i]>freq[i]){
                    possible=false;
                    break;
                }
            }
            if(possible){
                ans+=word.length();
            }
        }
        return ans;
    }
}
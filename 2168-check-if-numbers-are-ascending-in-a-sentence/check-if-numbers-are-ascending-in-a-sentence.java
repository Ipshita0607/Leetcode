class Solution {
    public boolean areNumbersAscending(String s) {
       String words[]=s.split(" ");
       int prev=0;
       for(int i=0;i<words.length;i++){
        if(words[i].charAt(0)>='0'&& words[i].charAt(0)<='9'){
            int num=Integer.parseInt(words[i]);
            if(num<=prev){
                return false;
            }
            prev=num;
        }
       } 
       return true;
    }
}
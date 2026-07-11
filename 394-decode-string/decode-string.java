class Solution {
    public String decodeString(String s) {
        Stack<Integer>CountStack=new Stack<>();
        Stack<StringBuilder> Stringstack=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                CountStack.push(num);
                Stringstack.push(curr);
                curr=new StringBuilder();
                num=0;
            }
            else if(ch==']'){
                int repeat=CountStack.pop();
                StringBuilder prev=Stringstack.pop();
                while(repeat-- >0){
                    prev.append(curr);
                }
                curr=prev;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
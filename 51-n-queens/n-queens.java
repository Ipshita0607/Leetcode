class Solution {
    List<String> construct(char[][] temp){
        List<String> res=new ArrayList<>();
        for(int i=0;i<temp.length;i++){
            res.add(new String(temp[i]));
        }
        return res;
    }
    void f(int col,char[][] temp,List<List<String>> ans,boolean[] rowflag,boolean[] upperDiagonal,boolean[] lowerDiagonal,int n){
        if(col==n){
            ans.add(construct(temp));
            return;
        }
        for(int row=0;row<n;row++){
            if(!rowflag[row]&&!upperDiagonal[row+col]&&!lowerDiagonal[n+(row-col)]){
                temp[row][col]='Q';
                rowflag[row]=true;
                upperDiagonal[row+col]=true;
                lowerDiagonal[n+(row-col)]=true;

                f(col+1,temp,ans,rowflag,upperDiagonal,lowerDiagonal,n);
                temp[row][col]='.';
                rowflag[row]=false;  
                upperDiagonal[row+col]=false;  
                lowerDiagonal[n+(row-col)]=false;  
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] temp=new char[n][n];
        // Arrays.fill(temp,'.');
        for(int i = 0; i < n; i++) {
            Arrays.fill(temp[i], '.');
        }
        boolean[] rowflag=new boolean[n];
        boolean[] upperDiagonal=new boolean[2*n];
        boolean[] lowerDiagonal=new boolean[2*n];
        f(0,temp,ans,rowflag,upperDiagonal,lowerDiagonal,n);
        return ans;
    }
}
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row:board){
            Arrays.fill(row,'.');
        }
        backtrack(0,board,ans,new HashSet<>(),new HashSet<>(),new HashSet<>());
        return ans;
    }
    private void backtrack(int row,char[][] board,List<List<String>> ans,Set<Integer> cols,Set<Integer> dia1,Set<Integer> dia2){
        int n=board.length;
        if(row==n){
            List<String> temp=new ArrayList<>();
            for(char[] r:board){
                temp.add(new String(r));
            }
            ans.add(temp);
            return;
        }

        for(int col=0;col<n;col++){
            if(cols.contains(col) || dia1.contains(row-col) || dia2.contains(row+col)) continue;

            board[row][col]='Q';
            cols.add(col);
            dia1.add(row-col);
            dia2.add(row+col);

            backtrack(row+1,board,ans,cols,dia1,dia2);

            board[row][col]='.';
            cols.remove(col);
            dia1.remove(row-col);
            dia2.remove(row+col);
        }
    }
}
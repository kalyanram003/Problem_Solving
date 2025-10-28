class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        if(s.length()<=numRows|| numRows==1){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        boolean goingDown=false;
        int r=0;
        for(char c:s.toCharArray()){
            rows[r].append(c);
            if(r==0 || r==numRows-1){
                goingDown= !goingDown;
            }
            r+=goingDown?1:-1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb:rows){
            res.append(sb);
        }
        return res.toString();
    }
}
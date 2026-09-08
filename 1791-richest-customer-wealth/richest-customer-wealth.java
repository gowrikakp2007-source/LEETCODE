class Solution {
    public int maximumWealth(int[][] accounts) {
        int c=0;
        for(int i=0;i<accounts.length;i++){
            int s=0;
            for(int j=0;j<accounts[0].length;j++){
                s=s+accounts[i][j];

            }
            if(c<s){
                c=s;
            }
        }
        return c;
        
    }
}
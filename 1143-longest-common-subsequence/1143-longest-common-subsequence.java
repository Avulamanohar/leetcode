class Solution {
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int n = text1.length(), m = text2.length();
        int[][] dp = new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return common(0,0,n,m,text1,text2,dp);
    }
    private int common(int i, int j, int n, int m, String t1, String t2, int[][] dp){
        if(i==n || j==m){
            return 0;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)){
            return dp[i][j] = 1 + common(i+1, j+1, n, m, t1, t2, dp);
        }
        return dp[i][j] = Math.max(common(i,j+1,n,m,t1,t2,dp), common(i+1,j,n,m,t1,t2,dp));
    }
}
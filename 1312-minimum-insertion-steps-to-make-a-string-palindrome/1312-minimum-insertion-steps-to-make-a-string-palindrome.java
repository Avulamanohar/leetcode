class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        StringBuilder s1 = new StringBuilder(s);
        s1 = s1.reverse();
        return n - mini(0,0,s,s1.toString(),n,dp);
    }
    private int mini(int i, int j, String t1, String t2, int n, int[][] dp){
        if(i==n || j==n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(t1.charAt(i) == t2.charAt(j)){
            return dp[i][j] = 1 + mini(i+1, j+1, t1,t2,n,dp);
        }
        return dp[i][j] = Math.max(mini(i,j+1,t1,t2,n,dp), mini(i+1,j,t1,t2,n,dp));
    }
}
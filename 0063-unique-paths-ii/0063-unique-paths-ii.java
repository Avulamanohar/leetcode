class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid)
    {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] dp = new int[n][m];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        return path(0,0,obstacleGrid,n,m,dp);
    }
    public int path(int i, int j, int[][] g, int n, int m, int[][] dp){
        if(i==n || j==m) return 0;
        if(g[i][j] == 1){
            return 0;
        }
        if(i==n-1 && j==m-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int down = path(i+1,j,g,n,m,dp);
        int right = path(i,j+1,g,n,m,dp);
        return dp[i][j] = down + right;
    }
}
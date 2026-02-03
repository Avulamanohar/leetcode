class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m];
        for(int[] row: dp){
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return path(0,0,triangle,m,dp);
    }
    private int path(int i, int j, List<List<Integer>> grid, int m, int[][] dp){

        if(i==m-1) return grid.get(i).get(j);

        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        int down = path(i+1,j,grid,m,dp);
        int dai = path(i+1,j+1,grid,m,dp);
        return dp[i][j] = Math.min(down,dai) + grid.get(i).get(j);
    }
}
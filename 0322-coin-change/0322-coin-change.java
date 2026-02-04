class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        Arrays.sort(coins);
        Set<Integer> hs=new HashSet<>();
        for(int i:coins)
        {
            hs.add(i);
        }
        List<Integer> arr=new ArrayList<>(hs);
        int a[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        { a[i]=arr.get(i);

        }
        int[][] dp = new int[a.length][amount + 1];
        for (int[] row : dp) Arrays.fill(row, -1);
        int ans = change(0, 0,amount, a, dp);
        return ans >= 1e9 ? -1 : ans;
    }
    private int change(int ind,int j, int target, int[] nums, int[][] dp) {
      
        if (ind == nums.length) {
            if (target == 0)
                return 0;
            else
                return Integer.MAX_VALUE;
        }
        if (dp[ind][target] != -1) return dp[ind][target];
        int notTake = change(ind+1,j, target, nums, dp);
          
          int take=(int)1e9;
          
          if(target-nums[ind]>=0)
          {
        
           int cake = change(ind,j+1, target - nums[ind], nums, dp);
            if(cake!=(int)1e9)
            {
              take=cake+1;
            }
          }
       
        return dp[ind][target] = Math.min(take, notTake);
    }
}

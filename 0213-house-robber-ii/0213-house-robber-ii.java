class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);

        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        for (int i = 0; i < n; i++) {
            dp1[i] = -1;
            dp2[i] = -1;
        }

        // Case 1: Include house 0, exclude last house
        int case1 = solve(nums, 0, n - 2, dp1);

        // Case 2: Exclude house 0, include last house
        int case2 = solve(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    private int solve(int[] nums, int start, int end, int[] dp) {
        if (start > end) return 0;
        if (dp[start] != -1) return dp[start];

        // Rob current house
        int take = nums[start] + solve(nums, start + 2, end, dp);

        // Skip current house
        int skip = solve(nums, start + 1, end, dp);

        dp[start] = Math.max(take, skip);
        return dp[start];
    }
}

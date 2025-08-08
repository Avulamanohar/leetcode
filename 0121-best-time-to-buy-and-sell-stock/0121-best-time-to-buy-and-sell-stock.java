class Solution {
    public int maxProfit(int[] prices)
     {
        int i,j;
        int n=prices.length;
        int profit=0;
        int a=prices[0];
        for(i=1;i<n;i++)
        {
            if(a>prices[i])
            {
                a=prices[i];
            }
            else
            {
                int k=prices[i]-a;
                profit=Math.max(k,profit);
            }
        }
        return profit;
         
}}
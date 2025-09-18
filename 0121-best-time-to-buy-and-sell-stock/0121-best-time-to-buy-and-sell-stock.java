class Solution {
    public int maxProfit(int[] prices)
     {
        int sum=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            sum=Math.max(prices[i]-min,sum);
            if(prices[i]<min)
            {
              min=prices[i];
            }
        }
         return sum;
}}
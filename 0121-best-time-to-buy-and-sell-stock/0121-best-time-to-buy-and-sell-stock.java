class Solution {
    public int maxProfit(int[] prices)
     {
        
        int n=prices.length;
        int p=prices[0];
        if(n==1)
        {
            return 0;
        }
        int k=0;
        for(int i=1;i<n;i++)
        {
            k=Math.max(k,prices[i]-p);
            p=Math.min(p,prices[i]);

        }
        return k;
         
}}
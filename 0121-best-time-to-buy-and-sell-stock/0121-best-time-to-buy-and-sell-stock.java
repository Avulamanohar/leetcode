class Solution {
    public int maxProfit(int[] prices)
     {
        
int n=prices.length;
int a=prices[0];
int k=0;
for(int i=1;i<n;i++)
{
   k=Math.max(k,prices[i]-a);
   a=Math.min(a,prices[i]);
}
return k;
         
}}
class Solution {
    public int maxSubArray(int[] nums)
     
     {
       int sum=0;
       int n=nums.length;
       int k=Integer.MIN_VALUE;
       int m=0;
       for(int i:nums)
       {
        k=Math.max(i,k);
        if(i<0)
        {
            m++;
        }
        if(m==n)
        {
            return k;
        }
       }
       for(int i=0;i<n;i++)
       {
        sum+=nums[i];
        if(sum<0)
        {
            sum=0;
        }
        k=Math.max(k,sum);
       }
        return k;
        
    }
}
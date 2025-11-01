class Solution {
    public int maxProduct(int[] nums) 
    {
        int i,j,k;
        int n=nums.length;
        int p=1;
        int l=Integer.MIN_VALUE;
        
       
       for( i=0;i<n;i++)
       {
        l=Math.max(l,nums[i]);
       }
        for(i=0;i<n;i++)
        { 
          if(nums[i]==0)
          {
            p=1;
          }
          else
          {
            p*=nums[i];
            l=Math.max(p,l);
          }

        }
        p=1;
         for(i=n-1;i>=0;i--)
        { 
          if(nums[i]==0)
          {
            p=1;
          }
          else
          {
            p*=nums[i];
            l=Math.max(p,l);
          }

        }
        return l;
        
    }
}
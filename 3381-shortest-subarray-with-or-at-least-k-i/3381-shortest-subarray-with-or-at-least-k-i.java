class Solution {
    public int minimumSubarrayLength(int[] nums, int k)
    {
        int b=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {  int f=0;
            for(int j=i;j<n;j++)
            {
             f|=nums[j];
             if(f>=k)
             {
                b=Math.min(b,j-i+1);
                break;
             }
            }
        }
        if(b==Integer.MAX_VALUE)
        {
            return -1;
        }
        return b;
        
    }
}
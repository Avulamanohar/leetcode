class Solution {
    public int maximumStrongPairXor(int[] nums) 
    {
        int n=nums.length;
        int k=-1;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {  int a=nums[i];
            int b=Math.min(nums[j],a);
            int c=Math.abs(a-nums[j]); 
                if(c<=b)
                {
                  k=Math.max(k,a^nums[j]);
                }
            }
        }
        if(k==-1)
        {
            return 0;
        }
        return k;
        
    }
}
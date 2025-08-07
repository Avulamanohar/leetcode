class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int i,j;
        int n=nums.length;
        int count=0;
        int b=0;
        for(i=0;i<n;i++)
        {
         if(nums[i]==1)
         {
            count++;
         }
         else
         {
            b=Math.max(b,count);
            count=0;
         }

        }
        
        return Math.max(b,count);
        
    }
}
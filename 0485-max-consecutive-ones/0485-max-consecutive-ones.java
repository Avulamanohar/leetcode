class Solution {
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int n=nums.length;
        int a=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
         if(nums[i]==1)
         {
            c++;
         }
         else
         {
            c=0;
         }
         a=Math.max(a,c);


        }
        return a;
    }
}
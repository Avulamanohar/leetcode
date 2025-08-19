class Solution {
    public long zeroFilledSubarray(int[] nums) 
    {
        long sum=0;
        int n=nums.length;
        int i=0;
        int j=0;
        long ans=0;
        while(i<n)
        {
           if(nums[i]==0)
           {
            sum++;
           }
           else
           {
            ans+=sum*(sum+1)/2;
            sum=0;
           }
           i++;
        }
        ans+=sum*(sum+1)/2;
        return ans;
        
    }
}
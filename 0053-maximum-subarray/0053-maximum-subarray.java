class Solution {
    public int maxSubArray(int[] nums)
     
     {
        int i,j,k;
        i=0;
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        while(i<n)
        {
            sum+=nums[i];
            maxi=Math.max(sum,maxi);
            if(sum<0)
            {
                sum=0;
            }
            i++;

        }
        return maxi;
        
    }
}
class Solution {
    public int sumOfSquares(int[] nums)
    {
        int n=nums.length;
        int i,j;
        int sum=0;
        for(i=0;i<n;i++)
        {
            if(n%(i+1)==0)
            {
                int b=nums[i]*nums[i];
                sum+=b;
            }
        }
        return sum;
        
    }
}
class Solution {
    public int[] leftRightDifference(int[] nums) 
    {
        int n=nums.length;
        int a[]=new int[n];
        int b[]=new int[n];
           int c[]=new int[n];
        for(int i=1;i<n;i++)
        {
         a[i]=nums[i-1]+a[i-1];
        }
         for(int i=n-2;i>=0;i--)
        {
         b[i]=nums[i+1]+b[i+1];
           
        }
        for(int i=0;i<n;i++)
        {
            c[i]=Math.abs(a[i]-b[i]);
        }
        return c;

    }
}
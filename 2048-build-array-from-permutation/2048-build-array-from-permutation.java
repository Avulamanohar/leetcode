class Solution {
    public int[] buildArray(int[] nums)

     {
        int a[]=new int[nums.length];
        int i,j,k;
        int n=nums.length;
        for(i=0;i<n;i++)
        {   int b=nums[i];
            a[i]=nums[b];
        }
        return a;
        
    }
}
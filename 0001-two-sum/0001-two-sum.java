class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int i,j;
        int n=nums.length;
        int a[]=new int[2];
        
     for(i=0;i<n-1;i++)
     {
        for(j=i+1;j<n;j++)
        {
            int sum=nums[i]+nums[j];
            if(sum==target)
            {
                a[0]=i;
                a[1]=j;
                break;
            }
        }
     }
     return a;
    }
}
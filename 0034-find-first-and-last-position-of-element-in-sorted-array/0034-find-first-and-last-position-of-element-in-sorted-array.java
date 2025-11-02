class Solution {
    public int[] searchRange(int[] nums, int target)
    {
     int a[]=new int[2];
     a[0]=low(nums,target);
     a[1]=high(nums,target);
     return a;   
    }
    public int low(int a[],int k)
    {
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(a[mid]>=k)
            {
                j=mid-1;
            }
            else
            {
                i=mid+1;
            }
            
        }
        if(i<a.length&&a[i]==k)
            {
                return i;
            }
            return -1;

    }
    public int high(int nums[],int k)
    {
         int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]<=k)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
            
        } 
        if(j>-1&&nums[j]==k)
            {
                return j;
            }
            return -1;

    }
}
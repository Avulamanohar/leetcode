class Solution {
    public int findMin(int[] nums) 
    {int i,j;
    int n=nums.length;
    i =0;
    j=n-1;
    if(nums[i]<nums[j])
    {
        return nums[0];
    }
    int a=Integer.MAX_VALUE;
    while(i<=j)
    {   int mid=i+(j-i)/2;
        
        if(nums[i]<=nums[mid])
        {
           
            a=Math.min(a,nums[i]);
             i=mid+1;
            
        }
        else
        {
           
            a=Math.min(a,nums[mid]);
             j=mid-1;
        }
    }
    return a;
        
    }
}
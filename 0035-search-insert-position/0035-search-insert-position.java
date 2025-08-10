class Solution {
    public int searchInsert(int[] nums, int target)
 {
  int i,j;
  int n=nums.length;
  i=0;
  j=n-1;
  while(i<=j)
  {
    int mid=i+(j-i)/2;
    if(nums[mid]<target)
    {
        i=mid+1;
    }
   else  if(nums[mid]>target)
    {
        j=mid-1;
    }
    else
    {
        
        return mid;
    }

  }  
  return i;    
    }
}
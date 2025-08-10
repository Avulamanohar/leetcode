class Solution {
    public int[] searchRange(int[] nums, int target)
    {
        int i,j;
        int ans1=-1;
        int ans2=-1;
        int n=nums.length;
          int b[]=new int[2];
          if(n==0)
          {
            b[0]=-1;
            b[1]=-1;
            return b;
          }
        i=0;
        j=n-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]<=target)
            {
                ans1=mid;
                i=mid+1;
            }
            else if(nums[mid]>target)
            {
            
                j=mid-1;
            }
        }
         i=0;
        j=n-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]<target)
            {
           
                i=mid+1;
            }
            else if(nums[mid]>=target)
            {
                     ans2=mid;
            
                j=mid-1;
            }
        }
        if(ans1!=-1&&nums[ans1]!=target)
        {
           ans1=-1;
        }
           if(ans2!=-1&&nums[ans2]!=target)
        {
           ans2=-1;
        }
      
        b[1]=ans1;
        b[0]=ans2;
        return b; 
        
    }
}
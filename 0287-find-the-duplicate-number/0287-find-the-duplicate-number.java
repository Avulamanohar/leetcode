class Solution {
    public int findDuplicate(int[] nums) {
       int a=1;
       int b=nums.length-1;
       while(a<=b)
       {
        int mid=a+(b-a)/2;
        if(find(nums,mid))
        {
            a=mid+1;
        }
        else
        {
            b=mid-1;
        }
       }
       return a;
     
    }
    public boolean find(int arr[],int mid)
    {
        int f=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=mid)
            {
                f++;
            }
            if(f>mid)
            {
                return false;
            }
        }
        return true;
    }
}
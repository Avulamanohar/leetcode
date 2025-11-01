class Solution {
    public int reversePairs(int[] nums) {

int a[]=new int[nums.length];
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        arr.add(nums[n-1]);
        a[n-1]=0;
        int c=0;
        for( int i=n-2;i>=0;i--)
        {
            int temp=predi(arr,nums[i]);
            a[i]=temp;
            c+=temp;
            arr.add(pred(arr,nums[i]),nums[i]);
        }
        return c;

        
    }
     public int predi(List<Integer> arr,int k)
    {
        int i=0;
        int j=arr.size()-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if((long)2*arr.get(mid)<(long)k)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }

return i;
    }
         public int pred(List<Integer> arr,int k)
    {
        int i=0;
        int j=arr.size()-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr.get(mid)<k)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }

return i;
    }
}
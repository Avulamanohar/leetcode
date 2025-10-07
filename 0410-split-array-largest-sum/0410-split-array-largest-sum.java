class Solution {
    public int splitArray(int[] nums, int k) 
    {  int a=0;
    int b=0;
        for(int i:nums)
        {
            a=Math.max(i,a);
            b+=i;
        }
        while(a<=b)
        {
            int mid=a+(b-a)/2;
            if(split(nums,k,mid))
            {
                b=mid-1;
            }
            else
            {
                a=mid+1;
            }
        }
        return a;
    }
    public boolean split(int a[],int k,int mid)
    {
        int f=0;
        int g=1;
        for(int i:a)
        {
            if(i>mid)
            {
                return false;
            }
            if(i+f<=mid)
            {
                f+=i;

            }
            else
            {
                g++;
                if(g>k)
                {
                    return false;
                }
                f=i;
            }
           
        }
         if(g>k)
            {
                return false;
            }
            return true;
    }
}
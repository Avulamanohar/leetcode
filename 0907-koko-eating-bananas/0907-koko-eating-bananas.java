class Solution {
    public int minEatingSpeed(int[] piles, int h) 
    {
        int a=Integer.MAX_VALUE;
        int b=1;
       
        int k=0;
        while(b<=a)
        {
            int mid=b+(a-b)/2;
            if(hi(h,piles,mid))
            {
             k=mid;
             a=mid-1;
            }
            else
            {
                b=mid+1;
            }
        }
        return k;
        
    }
    public boolean hi(int h,int a[],int k)
    {   int f=0;
        for(int i=0;i<a.length;i++)
        {
            f+=a[i]/k;
            if(a[i]%k!=0)
            {
                f++;
            }
        }
        if(f>h)
        {
            return false;
        }
        return true;
    }
}
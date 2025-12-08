class Solution {
    public int countTriples(int n) 
    {
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=(i+1)*(i+1);
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(count(a,a[i]+a[j]))
                {
                    c++;
                }
            }
        }
        return c;

        
    }
    public boolean count(int a[],int n)
    {
        int i=0;
        int j=a.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(a[mid]<n)
            {
                i=mid+1;
            }
            else if(a[mid]>n)
            {
                j=mid-1;
            }
            else
            {return true;}
        }
        return false;

    }
}
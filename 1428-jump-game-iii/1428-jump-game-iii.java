class Solution {
    public boolean canReach(int[] arr, int start)
    {
        Boolean b[]=new Boolean[arr.length];
        return can(arr,b,start);

    }
    public boolean can(int arr[],Boolean br[],int s)
    {
        if(arr[s]==0)
        {
            return true;
        }
        if(br[s]!=null)
        {
            return br[s];
        }
        br[s]=false;
        int a=s+arr[s];
        int b=s-arr[s];
        boolean c=false;
        boolean d=false;
        if(a<arr.length)
        { 
            
         c= can(arr,br,a);

        }
        if(b>-1)
        {  
           d= can(arr,br,b);
        }
        br[s]=c||d;
        return br[s];
    }
}
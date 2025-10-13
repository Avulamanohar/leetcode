class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int n=arr.length;
        int b=arr[n-1]+k+1;
        for(int i=1;i<b+1;i++)
        {
            if(!find(arr,i))
            {
              count++;
            }
            if(count==k)
            {
                return i;
            }
        }
        return -1;
    }
    public boolean find(int a[],int arr)
    {
        int i=0;
        int j=a.length-1;
        int f=-1;
        while(i<=j)
        { int mid=i+(j-i)/2;
            if(a[mid]==arr)
            {
                return true;
            }
            else if(a[mid]>arr)
            {
                j=mid-1;
            }
            else
            {
                i =mid+1;
            }
        }
        return false;

    }
}
class Solution {
    public int sumOddLengthSubarrays(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {  if(i%2==0)
        {
            sum+=arr[i];
        }
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j=j+2)
            {
                sum+=arr[j]-arr[i];
            }
        }
        return sum;
        
    }
}
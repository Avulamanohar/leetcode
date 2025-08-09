class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int i,j,k;
        int n=numbers.length;
      
        int b[]=new int[2];
        b[0]=1;
        b[1]=2;
        for(i=0;i<n-1;i++)
        {   j=i+1;
         k=n-1;
        
            while(j<=k)
            {
                int mid=j+(k-j)/2;
                 int sum;
                sum=numbers[i]+numbers[mid];
                if(sum<target)
                {
                    j=mid+1;
                }
                 else if(sum>target)
                {
                    k=mid-1;
                }
                else
                {
                    b[0]=i+1;
                    b[1]=mid+1;
                    return b;
                }
            }
        }
        return b;
    }
}
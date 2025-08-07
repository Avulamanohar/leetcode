class Solution {
    public int majorityElement(int[] nums)
    {  int i,k;
        Arrays.sort(nums);
        int n=nums.length;
        int m=n/2;
        int count =1;
        int s;
      if(n==0)
      {
        return 0;
      }
            s=nums[0];
        
        for(i=1;i<n;i++)
        {
          if(nums[i]==s)
          {
            count++;
            if(count>m)
            {
               
                break;
            }
          }
          else
          {
            s=nums[i];
            count=1;
          }
        }

return s;
        
    }
}
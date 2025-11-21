class Solution {
    public int countCompleteSubarrays(int[] nums)
    {
        Set<Integer> hs=new HashSet<>();
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }
        int m=hs.size();
        for(int i=0;i<n;i++)
        {
        Set<Integer> hs1=new HashSet<>();
        
            for(int j=i;j<n;j++)
            {
                hs1.add(nums[j]);
                 if(hs1.size()==m)
            {
                c++;
            }
            }
           
        }
        return c;
        
    }
}
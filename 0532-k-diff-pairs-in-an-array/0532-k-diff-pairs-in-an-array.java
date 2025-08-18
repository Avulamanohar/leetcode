class Solution {
    public int findPairs(int[] nums, int k) 
    {
        Arrays.sort(nums);
        Set<List<Integer>> hs=new HashSet<>();
        if(nums.length==1)
        {
            return 0;
        }
        
        int  n=nums.length;
        for(int i=0;i<n-1;i++)
        {   
            for(int j=i+1;j<n;j++)
        {
         List<Integer> arr=new ArrayList<>();
            if(nums[j]-nums[i]==k)
            {
              arr.add(nums[i]);
              arr.add(nums[j]);
               hs.add(arr);
            }
           
            
        }
        }
        return hs.size();
        
    }
}
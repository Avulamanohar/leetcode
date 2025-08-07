class Solution {
    public void rotate(int[] nums, int k)
    {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        int i,j;
        
        while(k>n)
        {
            k=k-n;
        }
        
        for(i=n-k;i<n;i++)
        {
            arr.add(nums[i]);
        }
        for(i=0;i<n-k;i++)
        {
            arr.add(nums[i]);
        }
        for(i=0;i<n;i++)
        {
            nums[i]=arr.get(i);
        }
        
  
    }
}
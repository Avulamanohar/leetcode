class Solution {
    public int minimumDifference(int[] nums, int k)
    {
        int n=nums.length;
        Arrays.sort(nums);
        if(n==1)
        {return 0;}
        int f=Integer.MAX_VALUE;
        for(int i=0;i<n-(k-1);i++)
        {
            
             f=Math.min(f,nums[i+k-1]-nums[i]);
            
        }
        return f;
        
    }
}
class Solution {
    public int longestSubarray(int[] nums) 
    {
        boolean b=false;
        List<Integer> arr=new ArrayList<>();
        arr.add(-1);
        int c=-1;
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==0)
             {
                
                
                if(arr.size()>=2)
                {
                    int k=arr.get(arr.size()-2);
                     c=Math.max(i-k-2,c);
                }
                arr.add(i);

             }
        }
        arr.add(nums.length);
        if(arr.size()==2)
        {
            return nums.length-1;
        }
        int n=arr.size();
        c=Math.max(arr.get(n-1)-arr.get(n-3)-2,c);

        return c;
        
    }
}
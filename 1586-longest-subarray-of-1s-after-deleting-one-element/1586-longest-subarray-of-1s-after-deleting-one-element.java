class Solution {
    public int longestSubarray(int[] nums) 
    {
        boolean b=false;
        List<Integer> arr=new ArrayList<>();
        arr.add(-1);
        for(int i=0;i<nums.length;i++)
        {
             if(nums[i]==0)
             {
                arr.add(i);
             }
        }
        arr.add(nums.length);
        if(arr.size()==2)
        {
            return nums.length-1;
        }
        int c=-1;
        for(int i=2;i<arr.size();i++)
        {
            c=Math.max(arr.get(i)-arr.get(i-2)-2,c);
        }
        return c;
        
    }
}
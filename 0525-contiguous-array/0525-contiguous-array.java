class Solution {
    public int findMaxLength(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        int sum=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {sum+=nums[i];
        if(!map.containsKey(sum))
        {
            map.put(sum,i);
        }
        else
        {
         int b=i-map.get(sum);
            k=Math.max(k,b);
        }

        }
        return k;
        
    }
}
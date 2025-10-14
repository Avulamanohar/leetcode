class Solution {
    public long maximumSubarraySum(int[] nums, int k)
    {  Map<Integer,Integer> map=new HashMap<>();
        long sum=0;
        for(int i=0;i<k;i++)
        {  sum+=nums[i];
           if(map.containsKey(nums[i]))
           {
            map.put(nums[i],map.get(nums[i])+1);
           }
           else
           {
            map.put(nums[i],1);
           }
        }
       
    
       long  b=0;
       if(map.size()==k)
       {
       b=Math.max(b,sum);
       }
        for(int i=k;i<nums.length;i++)
        {   
            sum+=nums[i];
            sum-=nums[i-k];  
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            } 
            else
            {
                map.put(nums[i],1);
            }
            map.put(nums[i-k],map.get(nums[i-k])-1);
            if(map.get(nums[i-k])==0)
            {
                map.remove(nums[i-k]);
            }
          

       if(map.size()==k)
       {
                 b=Math.max(sum,b);
       }

      
        }
        return b;
        
    }
}
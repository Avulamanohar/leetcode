class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,1);
        int n=nums.length;
        int pref=0;
        int count=0;
        int i,j;
        for(i=0;i<n;i++)
        {
            pref+=nums[i];
            int rem=pref-k;
            if(hs.containsKey(rem))
            {
               count+=hs.get(rem);
              
            }
          if(hs.containsKey(pref))
          {
            hs.put(pref,hs.get(pref)+1);

          }
          else
          {
            hs.put(pref,1);
          }
        } 
        return count;
        
    }
}
class Solution {
    public int thirdMax(int[] nums)
     {
        Set<Integer> hs=new HashSet<>();
        for(int i:nums)
        {
            hs.add(i);
        }
        List<Integer> arr=new ArrayList<>(hs);
        int n=arr.size();
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
          maxi=Math.max(maxi,arr.get(i));
        }
        if(n<3)
        {
            return maxi;
        }
        int maxi1=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)<maxi)
            {
                maxi1=Math.max(maxi1,arr.get(i));
            }
        }
          int maxi2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)<maxi1)
            {
                maxi2=Math.max(maxi2,arr.get(i));
            }
        }
     return maxi2;   
    }
}
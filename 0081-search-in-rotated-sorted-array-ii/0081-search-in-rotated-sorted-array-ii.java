class Solution {
    public boolean search(int[] nums, int target) 
    {
        int i,j;
        int n=nums.length;
        Set<Integer> hs=new LinkedHashSet<>();
        for(int k:nums)
        {
            hs.add(k);
        }
        ArrayList<Integer> arr=new ArrayList<>(hs);
        i=0;
        j=arr.size()-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(arr.get(mid)==target)
            {
                return true;
            }
            if(arr.get(i)<=arr.get(mid))
            {
                if(arr.get(i)<=target&&target<=arr.get(mid))
                {
                    j=mid-1;
                }
                else
                {
                    i=mid+1;
                }
            }
            else
            {
                if(arr.get(mid)<=target&&target<=arr.get(j))
                {
                    i=mid+1;
                }
                else
                {
                    j=mid-1;
                }
            }
        }
        
return false;
    }
}
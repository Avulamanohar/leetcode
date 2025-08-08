class Solution {
    public List<Integer> majorityElement(int[] nums)
    {    int i,j;
        int n=nums.length;
        int k=n/3;
       HashMap<Integer,Integer> hs=new HashMap<>();
        List<Integer> arr2=new ArrayList<>();
        
        for(i=0;i<n;i++)
        {   int a=nums[i];
            if(!hs.containsKey(a))
            {
                hs.put(a,1);
            }
            else
            {
               hs.put(a,hs.get(a)+1);
        }
        }
         
        Set<Integer> hm=hs.keySet();
       
        List<Integer> arr=new ArrayList<>(hm);
        int m=arr.size();
        for(i=0;i<m;i++)
        {    int b=arr.get(i);
            if(hs.get(b)>k)
            {  arr2.add(b);
                
            }
        }

return arr2;
        
    }
}
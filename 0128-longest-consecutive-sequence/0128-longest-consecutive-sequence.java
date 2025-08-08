class Solution {
    public int longestConsecutive(int[] nums)
    {
       
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        int i,j;
       if(n==0)
       {
        return 0;
       }
        for(int k:nums)
        {
            hs.add(k);
        }
        ArrayList<Integer> arr=new ArrayList<>(hs);
        Collections.sort(arr);
        int m=arr.size();
         if(m==1)
        {
            return 1;
        }
       int  count=1;
        int maxi=0;
        for(i=0;i<m-1;i++)
        {   
           if(Math.abs(arr.get(i+1)-arr.get(i))!=1)
        {
            count=1;
        } 
        else{
            count++;
        }
          maxi=Math.max(maxi,count);
      
           
        }
        return maxi;
        
    }
}
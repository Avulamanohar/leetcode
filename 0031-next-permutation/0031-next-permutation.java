class Solution {
    public void nextPermutation(int[] nums)
    {  
        ArrayList<Integer> arr4=new ArrayList<>();
        for(int p:nums)
        {
            arr4.add(p);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        int i,j;
        int n=nums.length;
        int ind=n-1;
        int hari=-1;
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
          ind=i;
              hari=i;
          break;
      
            }
        }
        if(hari==-1)
        {
        Collections.reverse(arr4);
        for(i=0;i<n;i++)
        {
            nums[i]=arr4.get(i);
        }
        return;
        }
        int a=nums[i+1];
        int k=i+1;
        for(i=ind+1;i<n;i++)
        {
            if(nums[i]>nums[ind])
            {
              if(a>nums[i])
              {
               
               a=nums[i];
               k=i;
              }
            }
        }
        
        nums[k]=nums[ind];
        nums[ind]=a;
        ArrayList<Integer> arr1=new ArrayList<>();
       for(i=0;i<ind+1;i++)
       {
        arr1.add(nums[i]);
       }
       
        for(i=ind+1;i<n;i++)
        {
            arr.add(nums[i]);
        }
        Collections.sort(arr);
        for(int f:arr)
        {
            arr1.add(f);
        }
         for(i=0;i<n;i++)
        {
           nums[i]=arr1.get(i);
        }

    }
}
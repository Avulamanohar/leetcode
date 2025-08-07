import java.util.*;
class Solution {
    public boolean check(int[] nums) 
    {   int i,j;
        int n=nums.length;
        boolean b=true;
        int k=-1;
        List<Integer> arr=new ArrayList<>();
        for(int p:nums)
        {
            arr.add(p);
        }

      
        
        for(i=0;i<n-1;i++)
        {
            if(arr.get(i)>arr.get(i+1))
            {
                k=i+1;
             
              break;
            }

        }
        if(k!=-1)
        {
            
        
        List<Integer> arr1=new ArrayList<>( cheker(arr,k));


         for(i=0;i<n-1;i++)
        {
            if(arr1.get(i)>arr1.get(i+1))
            {
             b=false;
             break;
            }

        }
        }
        
        return b;
    }
    public List<Integer> cheker(List<Integer> arr,int b )
    {
        List<Integer> arr1=new ArrayList<>();
        int i,j;
        int n=arr.size();
        for(i=b;i<n;i++)
        {
            arr1.add(arr.get(i));
    }
    for(i=0;i<b;i++)
    {
        arr1.add(arr.get(i));
    }
   return arr1;

       
    }
}
import java.util.*;
class Solution {
    public boolean check(int[] nums) 
    {
          ArrayList<Integer> arr=new ArrayList<Integer>();
          ArrayList<Integer> arr1=new ArrayList<Integer>();
    int n=nums.length;
    int i;
    int j=-1;
    boolean b=true;
    for(i=0;i<n;i++)
    {
      arr.add(nums[i]);
    }    
    for(i=0;i<n-1;i++)
    {
           if(arr.get(i)>arr.get(i+1))
           {
            j=i+1;
             
             break;
            
           }

    } 
    if(j!=-1)
    {
        ch(arr1,arr,j);
    }
          
         
         int m=arr1.size();
          for(i=0;i<m-1;i++)
          {
              if(arr1.get(i)>arr1.get(i+1))
              {
                b=false;
                break;
              }
          }
          return b;
  


    }
    public ArrayList<Integer> ch(ArrayList<Integer> arr1,ArrayList<Integer> arr,int j)
    {
             int n=arr.size();
             int i;
             for(i=j;i<n;i++)
             {
                arr1.add(arr.get(i));
             }
             for(i=0;i<j;i++)
             {
                arr1.add(arr.get(i));
             }
             return arr1;
    }
}
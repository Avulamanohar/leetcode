import java.util.*;
class Solution {
    public void moveZeroes(int[] nums)
     { int i,j;
       int n=nums.length;
       int count=0;
       ArrayList<Integer> arr=new ArrayList<>();
       for(i=0;i<n;i++)
       {
        if(nums[i]==0)
        {
            count++;
        }
        else
        {
            arr.add(nums[i]);
        }
       }
       while(count>0)
       {
        arr.add(0);
        count--;
       }
       for(i=0;i<n;i++)
       {
        nums[i]=arr.get(i);
       }
        
    }
}
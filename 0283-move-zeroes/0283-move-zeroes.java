import java.util.*;
class Solution {
    public void moveZeroes(int[] nums)
     {
        ArrayList<Integer> arr=new ArrayList<>();
        int i,j;
        int n=nums.length;
        int count=0;
        for(i=0;i<n;i++)
        {
           if(nums[i]==0)
           {
            count++;
           }
        }
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                arr.add(nums[i]);
            }
        }
        for(i=0;i<count;i++)
        {
            arr.add(0);
        }
        for(i=0;i<arr.size();i++)
        {
            nums[i]=arr.get(i);
        }
        
    }
}
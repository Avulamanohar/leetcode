import java.util.*;
class Solution {
    public void moveZeroes(int[] nums)
     { int count=0;
     List<Integer> arr=new ArrayList<>();
     for(int i=0;i<nums.length;i++)
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
     for(int i=0;i<count;i++)
     {
        arr.add(0);
     }
     int j=0;
     for(int i:arr)
     {nums[j++]=i;

     }
        
    }
}
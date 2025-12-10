/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums)
    {
      Arrays.sort(nums);
      ListNode temp=head;
      int c=0;
      boolean b=false;
      while(head!=null)
      {
         if(cont(nums,head.val))
         {
            b=true;
         }
         else
         {
            if(b)
            {
                c++;
               
            }
             b=false;
         }
         head=head.next;
      }
      if(b)
      {
        c++;
      }

return c;
        
    }
    public boolean cont(int nums[],int a)
    {
        int i=0;
        int j=nums.length-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            if(nums[mid]<a)
            {
                i=mid+1;
            }
            else if(nums[mid]>a)
            {
                j=mid-1;
            }
            else
            {
                return true;
            }

        }
                    return false;
    }
}
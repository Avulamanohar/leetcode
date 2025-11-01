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
    public ListNode modifiedList(int[] nums, ListNode head)
    {
        Arrays.sort(nums);
        List<Integer> arr=new ArrayList<>();

        while(head!=null)
        {
            if(!predicate(nums,head.val))
            {
                arr.add(head.val);
            }
            head=head.next;
        }
        if(arr.size()==0)
        {
            return null;
        }
        head=new ListNode(arr.get(0));
        ListNode head1=head;
        for(int i=1;i<arr.size();i++)
        {
            ListNode p=new ListNode(arr.get(i));
            head.next=p;
            head=p;
        }
        return head1;
        
    }
    public boolean predicate(int nums[],int k)
    {
        int i=0;
    int j=nums.length-1;
    while(i<=j)
    {
        int mid=i+(j-i)/2;
        if(nums[mid]<k)
        {
            i=mid+1;
        }
        else if(nums[mid]==k)
        {
           return true;
        }
        else
        {
            j=mid-1;
        }
    }
    return false;
    }
}
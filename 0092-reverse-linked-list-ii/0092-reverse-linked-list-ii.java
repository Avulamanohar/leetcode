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
    public ListNode reverseBetween(ListNode head, int left, int right)
    {
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
        List<Integer> arr1=new ArrayList<>();
       for(int i=left-1;i<right;i++)
       {
        arr1.add(arr.get(i));
       }
       Collections.reverse(arr1);
       int j=0;
       for(int i=left-1;i<right;i++)
       {
        arr.set(i,arr1.get(j++));
       }
       head=new ListNode(arr.get(0));
       ListNode temp1=head;
        for(int i=1;i<arr.size();i++)
        {
             ListNode temp=new ListNode(arr.get(i));
             head.next=temp;
             head=temp;
        }
        return temp1;


        
    }
}
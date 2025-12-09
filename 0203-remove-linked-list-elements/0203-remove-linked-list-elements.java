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
    public ListNode removeElements(ListNode head, int val) 
    {
       List<Integer> arr=new ArrayList<>();
       while(head!=null)
       {
        if(head.val!=val)
        {
            arr.add(head.val);
        }
        head=head.next;
       }
       if(arr.size()==0)
       {return null;}
       head=new ListNode(arr.get(0));
       ListNode head1=head;
       for(int i=1;i<arr.size();i++)
       {
        ListNode temp=new ListNode(arr.get(i));
        head.next=temp;
        head=temp;
       }
       return head1;
    }
}
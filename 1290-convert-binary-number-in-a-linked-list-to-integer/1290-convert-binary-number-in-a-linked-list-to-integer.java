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
    public int getDecimalValue(ListNode head)
    {
        int c=0;
        ListNode head1=head;
        List<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
    int n=arr.size();
        for(int i=n-1;i>=0;i--)
        {
            c+=Math.pow(2,n-1-i)*arr.get(i);

        }
        return c;



        
    }
}
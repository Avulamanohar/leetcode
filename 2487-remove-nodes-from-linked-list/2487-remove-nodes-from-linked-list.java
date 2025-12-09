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
    public ListNode removeNodes(ListNode head)
    {
        Stack<Integer> st=new Stack<>();
        List<Integer> arr=new ArrayList<>();
          if(head==null)
        {
            return null;
        }
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
      
        
        for(int i=arr.size()-1;i>=0;i--)
        {
              if(st.isEmpty()||st.peek()<=arr.get(i))
              {
                st.add(arr.get(i));
              }
        }
        if(st.isEmpty())
        {
            return null;
        }
        head=new ListNode(st.pop());
        ListNode head2=head;
        while(!st.isEmpty())
        {   ListNode temp=new ListNode(st.pop());
            head.next=temp;
            head=head.next;
        }
        return head2;
        
    }
}
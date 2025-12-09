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
    public int[] nextLargerNodes(ListNode head) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }
       Stack<Integer> st=new Stack<>();
      int a[]=new int[arr.size()];
       for(int i=arr.size()-1;i>=0;i--)
       {
        while(!st.isEmpty()&&st.peek()<=arr.get(i))
        {
            st.pop();
        }
        if(!st.isEmpty())
        {
            a[i]=st.peek();
        }
        st.push(arr.get(i));
       }

return a;
        
    }
}
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
    public ListNode reverseKGroup(ListNode head, int k) 
    {   
        if(head==null||head.next==null)

        {return head;}
        ListNode h=head;
        ListNode h1=head;
        List<Integer> lr=new ArrayList<>();
        while(h!=null)
        {
            lr.add(h.val);
            h=h.next;
        }
       
        Stack<Integer> st=new Stack();
        Stack<Integer> st1=new Stack();
        List<Integer> lr1=new ArrayList<>();
        for(int i=0;i<lr.size()-lr.size()%k;i++)
        {
           st.push(lr.get(i));
           
           if(st.size()==k)
           {
            while(!st.isEmpty())
            {
               lr1.add(st.pop());
            }
           }
          
     
        }
for(int i=lr.size()-lr.size()%k;i<lr.size();i++)
{
    lr1.add(lr.get(i));
}
           int j=0;
           while(j<lr1.size()&&h1!=null)
           {
                h1.val=lr1.get(j);
                j++;
                h1=h1.next;
           }
return head;
    }
}
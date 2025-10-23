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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode temp=head;
        if(head==null||head.next==null)
        {
            return head;
        }
        Map<Integer,Integer> hs=new HashMap<>();
        while(head!=null)
        {
            if(hs.containsKey(head.val))
            {
                hs.put(head.val,hs.get(head.val)+1);
            }
            else
            {
                hs.put(head.val,1);
            }
            head=head.next;
        }
        ArrayList<Integer> arr=new ArrayList<>(hs.keySet());
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<arr.size();i++)
        {
            int f=arr.get(i);
        if(hs.get(f)==1)
        {
            arr1.add(f);
        }
        }
        Collections.sort(arr1);
        if(arr1.size()==0)
        {
            return null;
        }
        head=new ListNode(arr1.get(0));
        ListNode p=head;
        for(int i=1;i<arr1.size();i++)
        {
           ListNode o=new ListNode(arr1.get(i));
           head.next=o;
            head=head.next;
        }
return p;
        
    }
}
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
    public void reorderList(ListNode head) 
    {
        List<Integer> arr=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        ListNode k=head;
        if(head==null||head.next==null)
        {
            return ;
        }
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;

        }
        int n=arr.size();
        int i=0;
        int j=n-1;
      while(i<j)
      {
        arr1.add(arr.get(i));
        arr1.add(arr.get(j));
        i++;
        j--;
      }
      if(n%2!=0)
      {
        arr1.add(arr.get(n/2));
      }
      ListNode head1=k;
      ListNode temp=head1;
      for( i=1;i<n;i++)
      {
        ListNode h=new ListNode(arr1.get(i));
        head1.next=h;
        head1=h;
      }
      head=temp;
    
        
    }
}
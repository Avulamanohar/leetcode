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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        while(l1!=null)
        {
            arr1.add(l1.val);
            l1=l1.next;
        }
         while(l2!=null)
        {
            arr2.add(l2.val);
            l2=l2.next;
        }
        List<Integer> arr3=new ArrayList<>();
        int m=arr1.size();
        int n=arr2.size();
        int c=0;
        Collections.reverse(arr1);
        Collections.reverse(arr2);
        for(int i=0;i<Math.min(m,n);i++)
        {
            int s=(arr1.get(i)+arr2.get(i))+c;
            arr3.add(s%10);
            c=s/10;
            
        }
        if(m>n)
        {
            arr3.add((arr1.get(n)+c)%10);
          c=(arr1.get(n)+c)/10;

            for(int i=n+1;i<m;i++)
            {
                arr3.add((arr1.get(i)+c)%10); 
            c=(arr1.get(i)+c)/10;

                    }
                 if(c!=0)
                 {
                    arr3.add(c);
                 }
        }
       else if(n>m)
        {
          arr3.add((arr2.get(m)+c)%10);
          c=(arr2.get(m)+c)/10;
            for(int i=m+1;i<n;i++)
            { 
                arr3.add((arr2.get(i)+c)%10); 
          c=(arr2.get(i)+c)/10;
                     
                 }   
                 if(c!=0)
                 {
                    arr3.add(c);
                 }
        }
        else
        {
            if(c!=0)
            {
                arr3.add(c);
            }
        }
        if(arr3.size()==0)
        {
            return null;
        }
        Collections.reverse(arr3);
        ListNode head=new ListNode(arr3.get(0));
        ListNode head1=head;
        for(int i=1;i<arr3.size();i++)
        {
            ListNode temp=new ListNode(arr3.get(i));
            head.next=temp;
            head=temp;
        }

        return head1;
    }
}
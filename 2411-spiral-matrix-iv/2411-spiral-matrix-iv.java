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
    public int[][] spiralMatrix(int m, int n, ListNode head) 
    {
        int a[][]=new int[m][n];
        List<Integer> arr= new ArrayList<>();
        while(head!=null)
        {
            arr.add(head.val);
            head=head.next;
        }int f=arr.size();
        int k=0;
        int l=0;
        int r=n-1;
        int t=0;
        int b=m-1;
        while(l<=r&&t<=b)
        {
            for(int i=l;i<=r;i++)
            {
                if(k>=f)
                {
                    a[t][i]=-1;
                }
                else
                {
                a[t][i]=arr.get(k++);
                }
            }
            t++;
            for(int i=t;i<=b;i++)
            {
                if(k>=f)
                {
                    a[i][r]=-1;
                }
                 else
                 {
                a[i][r]=arr.get(k++);
                 }
            }
            r--;
            if(t<=b)
            {
            for(int i=r;i>=l;i--)
            {
                if(k>=f)
                {
                    a[b][i]=-1;
                }
                else
                {
              a[b][i]=arr.get(k++);
                }
            }
            }
            b--;
            if(l<=r)
            {
            for(int i=b;i>=t;i--)
            {
                if(k>=f)
                {
                    a[i][l]=-1;
                }
                else
                {
                a[i][l]=arr.get(k++);
                }
            }
            }
            l++;
        }
      
        return a;
        
    }
}
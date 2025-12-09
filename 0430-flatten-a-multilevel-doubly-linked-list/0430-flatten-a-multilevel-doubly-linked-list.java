/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head)
     {
        List<Node> arr=new ArrayList<>();
        Node temp=head;
   flat(arr,head);
        if(arr.size()==0)
        {
            return null;
        }
     
        temp.child=null;
        for(int i=1;i<arr.size();i++)
        {
            temp.next=arr.get(i);
            temp.next.prev=temp;
            temp=temp.next;
           temp.child=null;
            
        }
        return head;
        
    }
    public void flat(List<Node> arr,Node head)
    {
        if(head==null)
        {
            return ;
        }
        arr.add(head);
        flat(arr,head.child);
        flat(arr,head.next);
    }
}
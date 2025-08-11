/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) 
    {  List<Integer> arr=new ArrayList<>();
        post(root,arr);
        return arr;
    }
    public void post(Node root,List<Integer> arr)
    {if(root==null)
    {
        return;
    }
        int n=root.children.size();
      
        for(int i=0;i<n;i++)
        {
            if(root.children.get(i)!=null)
            {
             post(root.children.get(i),arr);
            }
        }
          arr.add(root.val);
    }
}
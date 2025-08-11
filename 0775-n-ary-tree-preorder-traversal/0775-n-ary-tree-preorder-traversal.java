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
};
*/

class Solution {
    public List<Integer> preorder(Node root)
    {
      
        ArrayList<Integer> arr=new ArrayList<>();
     pre(root,arr);
     return arr;
        
    }
    public void pre(Node root,List<Integer> arr)
    {
        if(root==null)
        {return;}
        int m=root.children.size();
        arr.add(root.val);
        for(int i=0;i<m;i++)
        {
           if(root.children.get(i)!=null)
           {
            pre(root.children.get(i),arr);
           }
        }

    }
}
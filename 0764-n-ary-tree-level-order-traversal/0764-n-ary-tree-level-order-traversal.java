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
    public List<List<Integer>> levelOrder(Node root)
     {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        if(root==null)
        {
            return arr;
        }
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer> arr1=new ArrayList<>();
            int i,j;
            int n=q.size();
        
            for(i=0;i<n;i++)
            {
                Node t=q.poll();
                    int m=t.children.size();
                for(j=0;j<m;j++)
                {
                    if(t.children.get(j)!=null)
                    {
                        q.add(t.children.get(j));
                    }
                }
                arr1.add(t.val);
            }
            arr.add(arr1);
        }
        return arr;
        
    }
}
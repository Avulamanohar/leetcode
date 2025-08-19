/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
        if(root==null)
        {
            return "";
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty())
        {
            TreeNode r=q.poll();
            if(r==null)
            {
                sb.append("n ");
                
            }else{
            
              sb.append(r.val+" ");
                q.add(r.left);
                q.add(r.right);
            } 
            
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
        if(data.isEmpty())
    {
        return null;
    }
    Queue<TreeNode> q=new LinkedList<>();
    String b[]=data.split(" ");
    TreeNode r=new TreeNode(Integer.parseInt(b[0]));
    q.add(r);
    int i=1;
    while(!q.isEmpty()&&i<b.length)
    {
        TreeNode root=q.poll();
        if(!b[i].equals("n"))
        {
            TreeNode left=new TreeNode(Integer.parseInt(b[i]));
            root.left=left;
            q.add(left);

        }
        i++;
         if(!b[i].equals("n"))
        {
            TreeNode right=new TreeNode(Integer.parseInt(b[i]));
            root.right=right;
            q.add(right);

        }i++;
    
        
    }
    return r;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
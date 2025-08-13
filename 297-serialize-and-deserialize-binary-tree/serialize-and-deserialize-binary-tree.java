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
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        serializeHelper(root,sb);
        return sb.toString();
    }

    public void serializeHelper(TreeNode node,StringBuilder sb){
        if(node==null){
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        serializeHelper(node.left,sb);
        serializeHelper(node.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q=new LinkedList<>(Arrays.asList(data.split(",")));
        return deserializeHelper(q);
    }

    public TreeNode deserializeHelper(Queue<String> nodes){
        String vals=nodes.poll();
        if(vals.equals("null")) return null;

        TreeNode node=new TreeNode(Integer.parseInt(vals));
        node.left=deserializeHelper(nodes);
        node.right=deserializeHelper(nodes);
        return node;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
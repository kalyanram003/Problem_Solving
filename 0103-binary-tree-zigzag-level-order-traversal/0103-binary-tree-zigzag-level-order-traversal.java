/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return ans;
        }
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> sub=new LinkedList<>();
            for(int i=0;i<size;i++){
            TreeNode node=q.poll();
                if(level%2==0){
                    sub.addFirst(node.val);
                }
                else{
                    sub.addLast(node.val);
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
            ans.add(sub);
            level++;
        }
        return ans;
    }
}
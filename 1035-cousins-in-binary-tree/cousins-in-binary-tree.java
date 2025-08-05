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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level=q.size();
            boolean xD=false;
            boolean yD=false;

            for(int i=0;i<level;i++){
                TreeNode node=q.poll();
                if(node.left!=null && node.right!=null){
                    if((node.left.val==x && node.right.val==y) || (node.left.val==y && node.right.val==x)){
                        return false;
                    }
                }

                if(node.left!=null){
                    if(node.left.val==x) xD=true;
                    if(node.left.val==y) yD=true;
                    q.offer(node.left);
                }

                if(node.right!=null){
                    if(node.right.val==y) yD=true;
                    if(node.right.val==x) xD=true;
                    q.offer(node.right);
                }


            }
            if(xD && yD) return true;

            if(xD || yD) return false;
        }
        return false;
    }
}
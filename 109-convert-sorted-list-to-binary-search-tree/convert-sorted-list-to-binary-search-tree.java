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
    private ListNode head;
    public TreeNode sortedListToBST(ListNode head) {
        this.head=head;
        int size=listSize(head);
        return helper(0,size-1);
    }

    public int listSize(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }

    public TreeNode helper(int left,int right){
        if(left>right) return null;
        int mid=(left+right)>>1;

        TreeNode leftTree=helper(left,mid-1);
        TreeNode root=new TreeNode(head.val);

        root.left=leftTree;
        head=head.next;

        TreeNode rightTree=helper(mid+1,right);
        root.right=rightTree;
        return root;

    }

}
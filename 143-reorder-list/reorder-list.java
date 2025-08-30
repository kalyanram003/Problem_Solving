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
    public void reorderList(ListNode head) {
        List<ListNode> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int l=0;
        int r=arr.size()-1;
        while(l<r){
            arr.get(l).next=arr.get(r);
            l++;
            if(l==r) break;
            arr.get(r).next=arr.get(l);
            r--;
        }
        arr.get(l).next=null;
    }
}
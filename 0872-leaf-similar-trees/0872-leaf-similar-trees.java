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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        
        countLeafNode(root1,list1);
        countLeafNode(root2,list2);
        
        return list1.equals(list2);
        
    }
    public void countLeafNode(TreeNode root,ArrayList list){
        if(root==null){
            return ;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        countLeafNode(root.left,list);
        countLeafNode(root.right,list);
    }
}


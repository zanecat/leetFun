//Given a complete binary tree, count the number of nodes. 
//
// Note: 
//
// Definition of a complete binary tree from Wikipedia: 
//In a complete binary tree every level, except possibly the last, is completely
// filled, and all nodes in the last level are as far left as possible. It can hav
//e between 1 and 2h nodes inclusive at the last level h. 
//
// Example: 
//
// 
//Input: 
//    1
//   / \
//  2   3
// / \  /
//4  5 6
//
//Output: 6 
// Related Topics Binary Search Tree 
// 👍 2563 👎 240


package q.q222;

import dataStructure.TreeNode;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {
        Solution solution = new CountCompleteTreeNodes().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public int countNodes(TreeNode root) {
            return helper(root);
        }

        int helper(TreeNode node){
            if(node == null) return 0;
            return 1 + helper(node.left) + helper(node.right);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
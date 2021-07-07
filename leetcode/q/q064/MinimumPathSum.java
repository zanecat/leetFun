//Given a m x n grid filled with non-negative numbers, find a path from top left
// to bottom right, which minimizes the sum of all numbers along its path. 
//
// Note: You can only move either down or right at any point in time. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
//Output: 7
//Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
// 
//
// Example 2: 
//
// 
//Input: grid = [[1,2,3],[4,5,6]]
//Output: 12
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 200 
// 0 <= grid[i][j] <= 100 
// 
// Related Topics Array Dynamic Programming Matrix 
// 👍 5097 👎 86


package q.q064;

public class MinimumPathSum {
    public static void main(String[] args) {
        Solution solution = new MinimumPathSum().new Solution();
        solution.minPathSum(new int[][]{new int[]{1,2,3}, new int[]{4,5,6}});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int minPathSum(int[][] grid) {


            int m = grid.length, n = grid[0].length;
            int l = 0, r = 0;

            int [][] dp = new int[m][n];
            dp[0][0] = grid[0][0];

            for (int i = 1; i < m; i ++){
                dp[i][0] = dp[i - 1][0] + grid[i][0];
            }

            for (int i = 1; i < n; i ++){
                dp[0][i] = dp[0][i - 1] + grid[0][i];
            }

            for (int i = 1; i < m ; i ++){
                for (int j = 1; j < n; j ++){
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                }
            }

            return dp[m - 1][n - 1];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
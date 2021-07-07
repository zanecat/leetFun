//A robot is located at the top-left corner of a m x n grid (marked 'Start' in t
//he diagram below). 
//
// The robot can only move either down or right at any point in time. The robot 
//is trying to reach the bottom-right corner of the grid (marked 'Finish' in the d
//iagram below). 
//
// How many possible unique paths are there? 
//
// 
// Example 1: 
//
// 
//Input: m = 3, n = 7
//Output: 28
// 
//
// Example 2: 
//
// 
//Input: m = 3, n = 2
//Output: 3
//Explanation:
//From the top-left corner, there are a total of 3 ways to reach the bottom-righ
//t corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down
// 
//
// Example 3: 
//
// 
//Input: m = 7, n = 3
//Output: 28
// 
//
// Example 4: 
//
// 
//Input: m = 3, n = 3
//Output: 6
// 
//
// 
// Constraints: 
//
// 
// 1 <= m, n <= 100 
// It's guaranteed that the answer will be less than or equal to 2 * 109. 
// 
// Related Topics Math Dynamic Programming Combinatorics 
// 👍 5600 👎 250


package q.q062;

public class UniquePaths {
    public static void main(String[] args) {
        Solution solution = new UniquePaths().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int [][] record = null;
        public int uniquePaths(int m, int n) {
            this.record = new int[m + 1][n + 1];
            int i = 1;
            while (i < m + 1){
                for (int j = 1; j <= n ; j ++){
                    if (i == 1 || j == 1){
                        record[i][j] = 1;
                    } else {
                        record[i][j] = record[i-1][j] + record[i][j-1];
                    }
                }
                i++;
            }

            return record[m][n];
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
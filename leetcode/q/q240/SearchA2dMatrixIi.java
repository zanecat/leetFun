//Write an efficient algorithm that searches for a target value in an m x n inte
//ger matrix. The matrix has the following properties: 
//
// 
// Integers in each row are sorted in ascending from left to right. 
// Integers in each column are sorted in ascending from top to bottom. 
// 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[1
//8,21,23,26,30]], target = 5
//Output: true
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[1
//8,21,23,26,30]], target = 20
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= n, m <= 300 
// -109 <= matix[i][j] <= 109 
// All the integers in each row are sorted in ascending order. 
// All the integers in each column are sorted in ascending order. 
// -109 <= target <= 109 
// 
// Related Topics Array Binary Search Divide and Conquer Matrix 
// 👍 5155 👎 96


package q.q240;

public class SearchA2dMatrixIi {
    public static void main(String[] args) {
        Solution solution = new SearchA2dMatrixIi().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        int m, n;
        public boolean searchMatrix(int[][] ma, int ta) {
            m = ma.length;
            n = ma[0].length;

            int l = m - 1, r = 0;

            while (l >= 0 && r <= n -1){
                if (ma[l][r] == ta) return true;
                else if (ma[l][r] > ta) l--;
                else if (ma[l][r] < ta) r++;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
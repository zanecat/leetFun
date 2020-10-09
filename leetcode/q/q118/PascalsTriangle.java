//Given a non-negative integer numRows, generate the first numRows of Pascal's t
//riangle. 
//
// 
//In Pascal's triangle, each number is the sum of the two numbers directly above
// it. 
//
// Example: 
//
// 
//Input: 5
//Output:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//]
// 
// Related Topics 数组 
// 👍 360 👎 0

/*
brute force...
 */
  
package q.q118;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle{
  public static void main(String[] args) {
    Solution solution = new PascalsTriangle().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {

      List<List<Integer>> triangle = new ArrayList<List<Integer>>();

      if (numRows == 0) {
        return triangle;
      }

      triangle.add(new ArrayList<>());
      triangle.get(0).add(1);

      for (int rowNum = 1; rowNum < numRows; rowNum++) {
        List<Integer> row = new ArrayList<>();
        List<Integer> prevRow = triangle.get(rowNum-1);

        row.add(1);

        for (int j = 1; j < rowNum; j++) {
          row.add(prevRow.get(j-1) + prevRow.get(j));
        }

        row.add(1);

        triangle.add(row);
      }

      return triangle;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
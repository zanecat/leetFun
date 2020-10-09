//Given a non-empty array of integers nums, every element appears twice except f
//or one. Find that single one. 
//
// Follow up: Could you implement a solution with a linear runtime complexity an
//d without using extra memory? 
//
// 
// Example 1: 
// Input: nums = [2,2,1]
//Output: 1
// Example 2: 
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3: 
// Input: nums = [1]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 104 
// -3 * 104 <= nums[i] <= 3 * 104 
// Each element in the array appears twice except for one element which appears 
//only once. 
// 
// Related Topics 位运算 哈希表 
// 👍 1528 👎 0

  
package q.q136;
  
public class SingleNumber{
  public static void main(String[] args) {
    Solution solution = new SingleNumber().new Solution();
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
      int init = nums[0];
      for(int i = 1; i < nums.length; i++){
        init ^= nums[i];
      }

      return init;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
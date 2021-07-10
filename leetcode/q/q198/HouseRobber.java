//You are a professional robber planning to rob houses along a street. Each hous
//e has a certain amount of money stashed, the only constraint stopping you from r
//obbing each of them is that adjacent houses have security systems connected and 
//it will automatically contact the police if two adjacent houses were broken into
// on the same night. 
//
// Given an integer array nums representing the amount of money of each house, r
//eturn the maximum amount of money you can rob tonight without alerting the polic
//e. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 
//(money = 1).
//Total amount you can rob = 2 + 9 + 1 = 12.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 400 
// 
// Related Topics Array Dynamic Programming 
// 👍 7564 👎 200


package q.q198;

public class HouseRobber {
    public static void main(String[] args) {
        Solution solution = new HouseRobber().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int rob(int[] nums) {
            int [] dp = new int[nums.length];

            if (nums.length <= 3){
                if (nums.length == 0) return 0;
                if (nums.length == 1) return nums[0];
                if (nums.length == 2) return Math.max(nums[0], nums[1]);
                return Math.max(nums[0] + nums[2], nums[1]);
            }

            dp[0] = nums[0];
            dp[1] = nums[1];
            dp[2] = nums[0] + nums[2];

            for (int i = 3; i < nums.length; i ++){
                dp[i] = nums[i] + Math.max(dp[i - 2], dp[i - 3]);
            }

            return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
//Given the array nums, for each nums[i] find out how many numbers in the array 
//are smaller than it. That is, for each nums[i] you have to count the number of v
//alid j's such that j != i and nums[j] < nums[i]. 
//
// Return the answer in an array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation: 
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1). 
//For nums[3]=2 there exist one smaller number than it (1). 
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
// 
//
// Example 2: 
//
// 
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]
// 
//
// Example 3: 
//
// 
//Input: nums = [7,7,7,7]
//Output: [0,0,0,0]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 500 
// 0 <= nums[i] <= 100 
// 
// Related Topics Array Hash Table 
// 👍 1083 👎 28

  
package q.q1365;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber{
  public static void main(String[] args) {
    Solution solution = new HowManyNumbersAreSmallerThanTheCurrentNumber().new Solution();
    Integer x = 1;
    Integer u = 2;

    swap(x, u);
      System.out.println(x);
      System.out.println(u);
  }

  static void swap(Integer x, Integer y){
      x = 10;

      System.out.println(x);
      System.out.println(y);
  }
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums.length == 1) return new int[]{0};

        int [] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);
        int max = sorted[sorted.length - 1];
        int [] count = new int[max+1];


        for (int i = 1; i < sorted.length; i ++){
            if(sorted[i] > sorted[i-1]) count[sorted[i]] = i;
            else count[sorted[i]] = count[sorted[i-1]];
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i ++){
            result[i] = count[nums[i]];
        }

        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
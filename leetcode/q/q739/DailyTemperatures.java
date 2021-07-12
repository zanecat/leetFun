//Given an array of integers temperatures represents the daily temperatures, ret
//urn an array answer such that answer[i] is the number of days you have to wait a
//fter the ith day to get a warmer temperature. If there is no future day for whic
//h this is possible, keep answer[i] == 0 instead. 
//
// 
// Example 1: 
// Input: temperatures = [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
// Example 2: 
// Input: temperatures = [30,40,50,60]
//Output: [1,1,1,0]
// Example 3: 
// Input: temperatures = [30,60,90]
//Output: [1,1,0]
// 
// 
// Constraints: 
//
// 
// 1 <= temperatures.length <= 105 
// 30 <= temperatures[i] <= 100 
// 
// Related Topics Array Stack Monotonic Stack 
// 👍 4662 👎 135


package q.q739;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
    public static void main(String[] args) {
        Solution solution = new DailyTemperatures().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] dailyTemperatures(int[] temperatures) {
            int len = temperatures.length;
            int [] res = new int[len];
            Deque<Integer > st = new ArrayDeque<>();

            for (int i = len - 1; i >= 0; i --){
                while (!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                    st.pop();
                }
                if (st.isEmpty()){
                    res[i] = 0;
                } else {
                    res[i] = st.peek() - i;
                }
                st.push(i);
            }

            return res;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
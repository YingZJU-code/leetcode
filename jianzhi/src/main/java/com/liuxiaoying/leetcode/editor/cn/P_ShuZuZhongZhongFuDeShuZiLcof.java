// Date: 2021-09-09 22:16:33

//找出数组中重复的数字。 
//
// 
//在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请
//找出数组中任意一个重复的数字。 
//
// 示例 1： 
//
// 输入：
//[2, 3, 1, 0, 2, 5, 3]
//输出：2 或 3 
// 
//
// 
//
// 限制： 
//
// 2 <= n <= 100000 
// Related Topics 数组 哈希表 排序 
// 👍 543 👎 0


package com.liuxiaoying.leetcode.editor.cn;

//Java：【剑指 Offer 03】数组中重复的数字
public class P_ShuZuZhongZhongFuDeShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new P_ShuZuZhongZhongFuDeShuZiLcof().new Solution();
        
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]])
                    return nums[i];
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

        private void swap(int[] nums, int i, int j) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}



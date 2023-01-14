public class LeetCode713 {
    //解题思路：可以使用滑动窗口来解决这道题目
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //将题目的特殊情况先排除
        if (k <= 1)
            return 0;
        //定义滑动窗口的左右边界
        //右边界决定了在判断当前窗口内的各种情况下（只改变左窗口）的不用情况
        int n = nums.length,  left = 0;
        //num用来对个数进行计数
        int num = 0;
        //用来存放当前窗口内的值的乘积大小
        int curSum = 1;
        for (int right = 0; right < n; ++right) {
            //改变右窗口，乘以右窗口
            curSum *= nums[right];
            while (curSum >= k) // 不满足要求
                //改变左窗口
                curSum /= nums[left++];
            num += right - left + 1;
        }
        return num;
    }
}

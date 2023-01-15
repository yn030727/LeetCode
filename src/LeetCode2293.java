public class LeetCode2293 {
    class Solution {
        //解题思路：观察题目给出的算法解析，这道题可以根据模拟的思路来进行计算
        public int minMaxGame(int[] nums) {
            int n = nums.length;
            int temp = n;
            int[] newNums = nums;
            while(temp > 1){

                int i = 0;
                while(i < temp/2){
                    if(i % 2 == 0){
                        newNums[i] = Math.min(newNums[2 * i], newNums[2 * i + 1]);
                    }else{
                        newNums[i] = Math.max(newNums[2 * i], newNums[2 * i + 1]);
                    }
                    i++;
                }
                temp = temp/2;
            }
            return newNums[0];
        }
    }
}

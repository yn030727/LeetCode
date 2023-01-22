public class LeetCode1824 {
    //解题思路：动态规划的思想来处理问题
    //将题目转化成到达当前位置的最少跳跃次数
    //dp[][]数组表的的是第i点第j个跑道，对于到达当前点来说，数组的推导公式为 dp[i][j] = Math.min(dp[i-1][j] , dp[i][side] + 1) side表示的是从哪个跑道跳跃到当前跑道
    public int minSideJumps(int[] obstacles) {
        int length = obstacles.length;
        // dp[i][j] 表示青蛙到达 i 号点的 j 号跑道时所需要的最少侧跳次数
        int[][] dp = new int[length - 1][3];
        for (int i = 0; i < length - 1; i++) Arrays.fill(dp[i], length - 1);
        dp[0][1] = 0;
        dp[0][0] = 1;
        dp[0][2] = 1;
        for (int i = 1; i < length - 1 ; i++) {
            int minCnt = length - 1;

            for (int j = 0; j < 3; j++){
                if (j != obstacles[i] - 1)
                    minCnt = Math.min(minCnt, dp[i - 1][j]);
            }

            for (int j = 0; j < 3; j++) {
                // 如果i点j号跑道上有障碍物
                if (j == obstacles[i] - 1) continue;

                //没有障碍物的话，就进行推导
                dp[i][j] = Math.min(dp[i - 1][j], minCnt + 1);
            }

        }
        return Math.min(dp[length - 2][0], Math.min(dp[length - 2][1], dp[length - 2][2]));
    }
}

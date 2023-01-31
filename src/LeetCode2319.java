public class LeetCode2319 {
    //判断矩阵是不是X矩阵，通过模拟的思路来处理题目要求的两个问题
    public boolean checkXMatrix(int[][] grid) {
        //找出在对角线上的点
        int length = grid[0].length;
        for(int i=0 ; i<grid.length ; i++){

            for(int j=0 ; j<length ; j++){
                if(j == i || j == length-i - 1){
                    //对角线上的元素
                    if(grid[i][j] == 0){
                        return false;
                    }
                }else{
                    //不是对角线的元素
                    if(grid[i][j] != 0){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}

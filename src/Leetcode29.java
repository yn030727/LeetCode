public class Leetcode29 {
    //模拟过程
    //模拟打印矩阵的路径，初始位置是矩阵的左上角，初始方向是右
    //当路径超出界限或者进入之前访问过的位置时，顺时针旋转，进入下一个方向
    //判断路径是否进入之前访问的位置需要使用一个辅助矩阵
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        int colLength = matrix[0].length;
        int rowLength = matrix.length;
        boolean[][] visited = new boolean[rowLength][colLength];
        //总共的个数
        int total = colLength * rowLength;
        int[] order = new int[total];
        int row = 0 ;
        int column = 0;
        //表示 列+1 行+1 列-1 行-1
        //右 -> 下 -> 左 -> 上 （顺时针）
        int[][] directions = {{0 , 1} , {1 , 0} , {0 , -1} , {-1 , 0}};
        int directionIndex = 0;

        for(int i = 0 ; i < total ; i++){
            //答案数组
            order[i] = matrix[row][column];
            //辅助矩阵
            visited[row][column] = true;

            //按照当前方向继续前进的 下一个行和列
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            //下一个行和列是否超出范围 或者 已被访问过
            if(nextRow < 0 || nextRow >= rowLength || nextColumn < 0 || nextColumn >= colLength || visited[nextRow][nextColumn]){
                //说明要换方向了
                directionIndex = (directionIndex + 1) % 4;
            }
            row += directions[directionIndex][0];
            column += directions[directionIndex][1];
        }
        return order;
    }
}

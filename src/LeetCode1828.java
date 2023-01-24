public class LeetCode1828 {
    //解题思路：points是几个点，queries是几个圆，要求判断每个圆上面有几个点
    //暴力循环，判断当前坐标在不在圆的上面
    public int[] countPoints(int[][] points, int[][] queries) {
        int length = queries.length;
        int[] answer = new int[length];
        for(int i=0 ; i<length ; i++){
            for(int j=0 ; j<points.length ; j++){
                if(JudgePoints(queries[i][0] , queries[i][1] , queries[i][2] , points[j][0] , points[j][1])){
                    answer[i]++;
                }
            }
        }
        return answer;
    }
    public boolean JudgePoints(int xj , int yj , int r , int xi , int yi){
        if((xi - xj)*(xi - xj) + (yi - yj)*(yi - yj) <= r * r){
            return true;
        }else{
            return false;
        }
    }
}

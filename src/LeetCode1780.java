public class LeetCode1780 {
    //解题思路：将3的幂所有的结果想象成一个递增数组，选择递增数组当中的几个值构成当前想要的结果。
    //广度优先搜索：传进去当前
    public boolean checkPowersOfThree(int n) {
        return BFS(n , 0 , 0);
    }
    //目标值，当前值，当前进行判断的阶
    public boolean BFS(int n , int number , int current){
        if(number > n){
            return false;
        }else if (number == n){
            return true;
        }else if((int)Math.pow(3,current)>n){
            return false;
        }
        boolean f1 = BFS(n,number,current+1);
        boolean f2 = BFS(n,number + (int)Math.pow(3,current) , current+1);
        if(f1 || f2)return true;
        else return false;
    }
}

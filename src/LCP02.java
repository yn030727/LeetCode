public class LCP02 {
    //解题思路：模拟，根据题目给出的算式进行化简
    //num[0] 是分母  num[1]是分子
    public int[] fraction(int[] cont) {
        int[] num = new int[2];
        num[0] = 1;
        num[1] = 0;
        for(int i = cont.length-1 ; i>=0 ; i--){
            //保存当前分子
            int temp = num[1];
            //通过计算，可以找到分子分母转换之间的规律
            num[1] = num[0];
            num[0] = cont[i] * num[1] + temp;
        }
        return num;
    }
}

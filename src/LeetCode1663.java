public class LeetCode1663 {
    //解题思路：通过题目分析我们知道为了保证字典序的排序，越靠前的最好越小，越靠后的最好越大
    //可以使用贪心的思路解决这道题目
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        int number;
        for(int i = 1; i <= n; i++){
            //剩下的值减去最大的值，不包括当前位置，如果小于0，说明可以取最小值，依靠后面的值继续来达到要求的k值
            number = k - 26 * (n - i);    // 计算贪心得到的差值
            if(number > 0){
                sb.append((char)('a' - 1 + number));
                k -= number;
            }else{
                sb.append('a');
                k -= 1;
            }
        }
        return sb.toString();
    }

}

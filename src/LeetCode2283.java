public class LeetCode2283 {
    public static void main(String[] args) {

    }

    //解题思路：满足条件是数位i在num中出现了num[i]次  1在num中出现num[1]次
    public boolean digitCount(String num) {
        char[] number = num.toCharArray();
        for(int i=0 ; i<number.length ; i++){
            //用来记录当前出现的个数
            int num1 = 0;
            for(int j=0 ; j<number.length ; j++){
                //遍历每一个元素，查看是否满足条件
                if(Integer.valueOf(number[j]) - '0' == i){
                    num1++;
                }
            }
            if(num1 == Integer.valueOf(number[i]) - '0'){
            }else {
                return false;
            }
        }
        return true;
    }
}

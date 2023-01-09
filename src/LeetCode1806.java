import java.util.Arrays;

public class LeetCode1806 {
    public static void main(String[] args) {

    }
    //解题思路：对于新数组，如果序列是偶数，那么变为值是当前偶数的二分之一
    //可以不断地对题目提供的要求进行模拟来解决问题
    public int reinitializePermutation(int n) {
        int[] perm = new int[n];
        int[] target = new int[n];
        for(int i=0 ; i<n ; i++){
            perm[i] = i;
            target[i] = i;
        }
        int temp = 0;
        for(int i=0 ; i<n ; i++){
            if(i % 2 == 0){
                target[i] = target[i/2];
            }else{
                target[i] = target[n / 2 + (i - 1) / 2];
            }
        }
        temp++;
        while( !Arrays.equals(perm , target) ){
            //不相等的话就进入循环
            //改变target数组的值
            for(int i=0 ; i<n ; i++){
                if(i % 2 == 0){
                    target[i] = target[i/2];
                }else{
                    target[i] = target[n / 2 + (i - 1) / 2];
                }
            }
            temp++;

        }
        return temp;
    }

}
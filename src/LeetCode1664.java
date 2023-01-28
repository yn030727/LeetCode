public class LeetCode1664 {
    //解题思路：要求满足奇数下标的元素和与偶数下标元素的和相等
    //题目可以分析成之前奇数位置 + 之后原先的偶数 = 之前偶数位置 + 之后原先的奇数
    public int waysToMakeFair(int[] nums) {
        int length = nums.length;
        int number = 0;
        int[] old = new int[length + 1];
        int[] New = new int[length + 1];

        for(int i=0 ; i<= length ; i++){
            if( i % 2 == 0){
                New[i] = New[i - 1] + nums[i - 1];
                old[i] = old[i - 1];
            }else{
                old[i] = old[i - 1] + nums[i - 1];
                New[i] = New[i - 1];
            }
        }

        for(int i = 1 ; i <= length ; i++){
            if(old[i - 1] + New[length] - New[i] == New[i - 1] + old[length] - old[i]){
                number++;
            }
        }
        return number;
    }
}

import java.util.HashMap;

public class LeetCode1814 {
    public int countNicePairs(int[] nums) {
        //将题目转化成nums[i]-rev(nums[i]) = nums[j]-rev(nums[j])
        //然后用哈希表去存储结果
        int[] revNums = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            //反转数字
            //123 321    120  21
            int number = nums[i];
            int n=0;
            while(number!=0){
                n = n * 10 + number % 10;
                number /= 10;
            }
            revNums[i] = n;
        }
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        long res = 0;
        int mod = (int) 1e9 + 7;
        for(int i=0 ; i<nums.length ; i++) {
            int number = hashMap.getOrDefault(nums[i] - revNums[i], 0);
            res += number;
            int number1 = number + 1;
            hashMap.put(nums[i] - revNums[i], number1);
        }
        return (int)(res % mod);
    }

    //超时题解
    //模拟，可以通过模拟的做法来进行下标对的记录
    public int countNicePairs1(int[] nums) {
        int[] revNums = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            //反转数字
            //123 321    120  21
            int number = nums[i];
            int n=0;
            while(number!=0){
                n = n * 10 + number % 10;
                number /= 10;
            }
            revNums[i] = n;
        }
        int res = 0;
        for(int i=0 ; i<nums.length - 1 ; i++){
            for(int j=i + 1 ; j<nums.length ; j++){
                if(JudgeNicePairs(nums[i] , nums[j] , revNums[i] ,revNums[j])){
                    res++;
                }
            }
        }
        return res;
    }
    public boolean JudgeNicePairs(int num1 , int num2 , int revNum1 , int revNum2){
        if(num1 + revNum2 == num2 + revNum1){
            return true;
        }else{
            return false;
        }
    }
}

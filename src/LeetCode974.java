import java.util.HashMap;

public class LeetCode974 {
    //解题思路：采用同余定理来处理问题
    //子数组的前缀和presum[j] 和 presum[i].  presum代表0到当前位置的所有子元素和
    //判断 (presum[j] - presum[i])中间子区间是否可以整除k
    //(presum[j] - presum[i]) % k == 0
    //presum[j]%k = presum[i]%k
    public int subarraysDivByK(int [] nums , int k){
        int presum = 0;
        HashMap<Integer , Integer> hashMap = new HashMap<>();
        int count = 0;
        hashMap.put(0,1);
        //所以对于当前的presum值来说，想要知道它前面子区间满足条件的个数，只要找到和它presum % k 相同的即可
        //我们将这个值叫做key，并放入到哈希表中进行存储
        //通过哈希表来存储
        for(int number : nums){
            presum += number;

            //处理负数的情况
            int key = (presum % k + k ) % k;

            if (hashMap.containsKey(key)){
                count += hashMap.get(key);
            }

            hashMap.put(key , hashMap.getOrDefault(key,0) + 1);
        }
        return count;
    }
    // //判断子数组是否能被k整除，可以先计算出子数组的和
    // public int subarraysDivByK(int[] nums, int k) {
    //     int length = nums.length;
    //     int temp = 0;
    //     for(int i=0 ; i<length ; i++){
    //         int[] number = new int[length];
    //         for(int j=i ; j<length ; j++){
    //             if(j != i){
    //                 number[j] = number[j - 1] + nums[j];
    //             }else{
    //                 number[j] = nums[j];
    //             }
    //             if(number[j] % k == 0){
    //                 temp++;
    //             }
    //         }
    //     }
    //     return temp;
    // }
}

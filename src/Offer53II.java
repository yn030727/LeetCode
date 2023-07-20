public class Offer53II{
    public int missingNumber(int[] nums){
        int length = nums.length;
        if(length == 1){
            if(nums[0] == 0){
                return 1;
            }else{
                return 0;
            }
        }

        for(int i = 0 ; i < length - 1; i++){
            if(nums[i + 1] - nums[i] > 1){
                return nums[i] + 1;
            }
        }
        return nums[length - 1] + 1;
    }
}

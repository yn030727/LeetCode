public class Offer57 {

    public int[] twoSum(int[] nums , int target){
        int i = 0 ;
        int j = nums.length - 1;
        while(i < j){
            int target1 = nums[i] + nums[j];
            if(target1 > target){
                j--;
            }else if(target1 < target){
                i++;
            }else{
                return new int[] {nums[i] , nums[j]};
            }
        }
        return null;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Offer53 {
    //两次二分找出开始的左边界和右边界
    public int search(int[] nums , int target){
        int length = nums.length;
        //几种特殊情况的判断
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0] == target ? 1 : 0;
        }
        //判断是否存在满足目标值的数值
        boolean flag =false;

        //开始寻找左边界
        int left = 0 ;
        int right = length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                flag = true;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        int leftIndex = left;

        //开始寻找右边界
        left = 0;
        right = length - 1;
        while(left < right){
            int mid = (left + right + 1) / 2;
            if(nums[mid] == target){
                flag = true;
            }
            if(nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid;
            }
        }

        //通过右边界 - 左边界计算出最终的答案
        int rightIndex = 0 ;
        int res = 0 ;
        if(flag){
            rightIndex = right;
            res = rightIndex - leftIndex + 1;
        }

        return res;

    }
}

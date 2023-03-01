public class LeetCode112 {
    //解题思路：最左边的数只要大于右边的数即可，最右边的数只要大于左边的数即可。
    //二分查找的思路：最重要的点在于查找的方向判断，前进的方向最好是一直向上，因为只要一直往上，就算严格递增，也会在最顶上找到峰值
    //而如果一直往下走的话，无法判断峰值是否存在。
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        int mid = 0;
        if(length == 1){
            return 0;
        }
        while(left <= right){
            //获取中间值
            mid = (left + right) / 2;
            if(mid == length - 1){
                if(nums[mid] > nums[mid - 1]){
                    return mid;
                }
            }else if(mid == 0){
                if(nums[mid] > nums[mid+1]){
                    return mid;
                }
            }else if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
                //找到峰值
                return mid;
            }
            //只有左右相邻确保不会相同
            if(nums[mid] >nums[mid+1]){
                right = mid;
            }else{
                left = mid+1;
            }

        }
        return mid;
    }
}

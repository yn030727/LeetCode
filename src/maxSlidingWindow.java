import java.util.Comparator;
import java.util.PriorityQueue;

public class maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums , int k){
        int n = nums.length;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //不是宏观所有数据的优先级规则，而是针对两个数据的比较
                //如果值不相同，优先级取决于值的大小
                //如果值相同，优先级取决于索引的大小（先进来的优先级大）
                return o1[0] != o2[0] ? o2[0] - o1[1] : o2[1] - o1[1];
            }
        });
        for(int i = 0 ; i < k ; i++){
            pq.offer(new int[]{nums[i] , i});
        }
        //答案数组
        int[] ans = new int[n - k + 1];
        ans[0] = pq.peek()[0];

        //滑动窗口
        for(int i = k ; i < n ; i++){
            //右边新元素 加入到优先队列中
            pq.offer(new int[]{nums[i] , i});
            while(pq.peek()[1] <= i - k){
                //最大元素不在滑动窗口内
                pq.poll();
            }
            ans[i - k + 1] = pq.peek()[0];
        }
        return ans;
    }
}

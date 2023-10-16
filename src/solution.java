import java.util.*;

public class solution {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){

                System.out.print(" " + i + "*" + j + "=" + (i * j)+"\t");//   "\t"这是JAVA语言默认的制表符号,使用此符号，打印出的乘法表格较为美观
                if(i == j){
                    System.out.print("\n");//当换行条件成立时，进行换行打印
                }

            }
        }
    }
    public  int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numMap = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < target){
                if(numMap.containsKey(target - nums[i])){
                    return new int[] {i , numMap.get(target - nums[i])};
                }else{
                    numMap.put(nums[i] , i);
                }
            }
        }
        return null;
    }


//    public ListNode deleteMiddle(ListNode head){
//        if(head == null){
//            return null;
//        }
//        ListNode slow = head;
//        ListNode quick = head;
//        ListNode cur = null;
//        int temp = 1;
//        while (quick != null) {
//            if(temp == 2){
//                cur = head;
//            }
//            if(temp % 2 == 0){
//                slow = slow.next;
//                quick = quick.next;
//                cur = cur.next;
//            }else{
//                quick = quick.next;
//            }
//            temp++;
//        }
//        cur.next = slow.next;
//        slow = null;
//        return head;
//    }




//    public List<List<Integer>> levelOrder(TreeNode root){
//        List<List<Integer>> lists = new ArrayList<>();
//        Queue<TreeNode> queue = new ArrayDeque<>();
//        if(root == null) return lists;
//        queue.offer(root);
//        while(!queue.isEmpty()){
//            List<Integer> list = new ArrayList<>();
//            int len = queue.size();
//            for(int i = 0 ; i < len ; i++){
//                if(queue.peek().left != null){
//                    queue.offer(queue.peek().left);
//                }
//                if(queue.peek().right != null){
//                    queue.offer(queue.peek().right);
//                }
//                list.add(queue.poll().val);
//            }
//            lists.add(list);
//        }
//        return lists;
//    }
}

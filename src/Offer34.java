import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Offer34 {
    List<List<Integer>> lists = new LinkedList<>();
    LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root , int target){
        findSum(root , target);
        return lists;
    }
    public void findSum(TreeNode node , int tar){
        if(node == null)return ;
        list.add(node.val);
        tar -= node.val;
        //从根节点到叶子结点
        if(tar == 0 && node.left == null && node.right == null){
            lists.add(new LinkedList<>(list));
        }
        findSum(node.left , tar);
        findSum(node.right , tar);
        list.removeLast();
    }
}

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Offer32I {
    public int[] levelOrder(Node root){
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(queue.isEmpty()){
            Node node1 = queue.poll();
            arrayList.add(node1.val);
            if(node1.left != null){
                queue.offer(node1.left);
            }
            if(node1.right != null){
                queue.offer(node1.right);
            }
        }
        int[] numbers = new int[arrayList.size()];
        for(int i = 0 ; i < arrayList.size() ; i++){
            numbers[i] = arrayList.get(i);
        }
        return numbers;
    }
}

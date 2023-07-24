import org.w3c.dom.Node;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32II {
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root){
            List<List<Integer>> arrayLists = new ArrayList<>();
            Queue<TreeNode> leftQueue = new LinkedList<>();
            Queue<TreeNode> rightQueue  = new LinkedList<>();
            if(root == null){
                return arrayLists;
            }

            leftQueue.offer(root);
            while(!leftQueue.isEmpty() || !rightQueue.isEmpty()){
                ArrayList<Integer> arrayList = new ArrayList<>();
                if(!leftQueue.isEmpty()){
                    //如果左边不为空
                    while(!leftQueue.isEmpty()){
                        TreeNode node = leftQueue.poll();
                        arrayList.add(node.val);
                        if(node.left != null){
                            rightQueue.offer(node.left);
                        }
                        if(node.right != null){
                            rightQueue.offer(node.right);
                        }
                    }

                }else{
                    //如果右边不为空
                    while(!rightQueue.isEmpty()){
                        TreeNode node = rightQueue.poll();
                        arrayList.add(node.val);
                        if(node.left != null){
                            leftQueue.add(node.left);
                        }
                        if(node.right != null){
                            leftQueue.add(node.right);
                        }
                    }
                }
                arrayLists.add(arrayList);
            }
            return arrayLists;
        }
    }
}

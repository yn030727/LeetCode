import java.util.*;

public class Offer32III {
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> arrayLists = new ArrayList<>();
        ArrayDeque<TreeNode> leftQueue = new ArrayDeque<>();
        ArrayDeque<TreeNode> rightQueue = new ArrayDeque<>();
        if(root == null){
            return arrayLists;
        }
        //因为奇数行都是从左到右，偶数行都是从右到左
        //所以leftQueue的出队列顺序是从队头出
        //rightQueue的出队列顺序是从队尾出

        leftQueue.offer(root);
        while(!leftQueue.isEmpty() || !rightQueue.isEmpty()){
            ArrayList<Integer> arrayList = new ArrayList<>();
            if(!leftQueue.isEmpty()){
                //如果左边不为空
                while(!leftQueue.isEmpty()){
                    TreeNode node = leftQueue.pollFirst();
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
                //下面部分要做一定的修改
                //首先是addFirst，因为第二行的队列是反着的。如果还是正常加入到leftQueue中的话，那么leftQueue中从左到右出来的也是反着的
                //此外，还需要改变左右结点的顺序，理由同上
                while(!rightQueue.isEmpty()){
                    TreeNode node = rightQueue.pollLast();
                    arrayList.add(node.val);
                    if(node.right != null){
                        leftQueue.addFirst(node.right);
                    }
                    if(node.left != null){
                        leftQueue.addFirst(node.left);
                    }
                }
            }
            arrayLists.add(arrayList);
        }
        return arrayLists;
    }
}

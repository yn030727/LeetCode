import java.util.*;

public class LeetCode429 {


    public List<List<Integer>> levelOrder(Node root){
        if(root == null)return null;
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        firstList.add(root.val);
        answer.add(firstList);
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> currentList = new ArrayList<>();
            Node currentNode = queue.poll();
            int length = currentNode.children.size();
            for(int i = 0 ; i < length ; i++){
                if(currentNode.children.get(i) != null){
                    queue.add(currentNode.children.get(i));
                    currentList.add(currentNode.children.get(i).val);
                }
            }
            answer.add(currentList);
        }
        return answer;
    }

    static class Node{
        public int val;
        public List<Node> children;

        public Node(){}
        public Node(int _val){
            val = _val;
        }
        public Node(int _val , List<Node> _children){
            val = _val;
            children = _children;
        }
    }
}

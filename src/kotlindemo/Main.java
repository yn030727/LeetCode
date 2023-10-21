package kotlindemo;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque arrayDeque = new ArrayDeque<>();
        Main main = new Main();
        TreeNode root = new TreeNode();
        main.addNumber();
    }
    public void addNumber(){

    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(){};
        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(int val , TreeNode left , TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

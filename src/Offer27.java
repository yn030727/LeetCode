import java.util.ArrayDeque;
import java.util.Deque;

public class Offer27 {
    //若当前节点左右两边节点形成的子树，它们都各自内部完成了翻转
    //那么这个时候当前节点只要交换左右节点
    //以当前节点为子树的树，其也完成了内部镜像
    //root.right = left;
    //当前的left来源于下一层（所以采用递归）
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)return null;
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}

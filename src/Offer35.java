import java.util.HashMap;
import java.util.Map;

public class Offer35 {
    public static void main(String[] args) {

    }


    //本题目的要求是深拷贝，所以每个新的结点的内存地址和原始的链表的内存地址一定不一样
    Map<Node , Node> cachedNode = new HashMap<Node , Node>();

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        //对于任意指针来说，可能它后面的结点还没有创建
        if(!cachedNode.containsKey(head)){
            //拷贝结点
            Node newHead = new Node(head.val);
            cachedNode.put(head , newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }
        return cachedNode.get(head);
    }
}


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Offer52 {
    //通过哈希表来存储
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> hashSet = new HashSet<ListNode>();
        ListNode tempA = headA;
        ListNode tempB = headB;
        while(tempA != null){
            hashSet.add(tempA);
            tempA = tempA.next;
        }
        while(tempB != null){
            if(hashSet.contains(tempB)){
                return tempB;
            }else{
                tempB = tempB.next;
            }
        }
        return null;
    }
}

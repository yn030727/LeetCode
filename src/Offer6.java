import java.util.ArrayList;

public class Offer6 {
    public static void main(String[] args) {

    }

    public int[] reversePrint(ListNode head){
        int[] array = new int[10000];
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            array[size] = temp.val;
            temp = temp.next;
            size++;
        }
        int[] number = new int[10000];
        for(int i = 0 ; i < size ; i++){
            number[i] = array[size - 1];
            size--;
        }
        return number;
    }

    public int[] reversePrint2(ListNode head){
        recursion(head);
        int[] number = new int[arrayList.size()];
        for(int i = 0 ; i < arrayList.size() ; i++){
            number[i] = arrayList.get(i);
        }
        return number;
    }

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
     void recursion(ListNode temp){
        if(temp == null){
            return ;
        }else{
            recursion(temp.next);
        }
        arrayList.add(temp.val);
    }
}

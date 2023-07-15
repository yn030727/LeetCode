import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> A,B;
    public CQueue(){
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value){
        A.addLast(value);
    }

    public int deleteHead(){
        //如果B不是空的
        if(!B.isEmpty()) return B.removeLast(); //删除并返回此列表中的最后一个元素
        //B是空，A也是空
        if(A.isEmpty()) return -1;
        //B是空，A不是空
        while(!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
    }
}

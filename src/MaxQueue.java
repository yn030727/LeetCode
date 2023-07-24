import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxQueue {
    Deque<Integer> q;//最大值队列，使用Deque的原因是它可以双向增删
    Queue<Integer> p;
    public MaxQueue() {
        q = new LinkedList<>();//Linked List实现了Queue接口，可以使用offer()方法在队列尾加元素，poll()在队列头删除
        p = new LinkedList<>();
    }

    public int max_value() {
        if(q.isEmpty()){
            return -1;
        }
        //注意这里是查询，不用出栈
        return q.peekFirst();
    }

    public void push_back(int value) {
        //先维护最大值队列，把队尾大的出栈
        while (q.isEmpty() != true && q.peekLast() < value) {
            q.pollLast();
        }
        p.offer(value);
        q.offerLast(value);
    }

    public int pop_front() {
        //注意不要只出一个，最大值队列也要出
        if(q.isEmpty() == false){
            if(q.peekFirst().equals(p.peek())){
                q.pollFirst();
            }
        }
        if(p.isEmpty()){
            return -1;
        }
        return p.poll();
    }
}

package Compilation;

import java.util.LinkedList;

public class Factroy {
    private int MAX = 10;
    private LinkedList<Object> list = new LinkedList<>();

    public void produce(){
        synchronized (list){
            while(list.size() >= MAX){
                System.out.println("生产者 " + Thread.currentThread().getName() + "已满");
                try{
                    list.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.add(new Object()); //不满就生产
            System.out.println("生产者" + Thread.currentThread() + "仓库数量为" + list.size());
            list.notifyAll();
        }
    }

    public void consume(){
        synchronized (list){
            while(list.size() == 0){
                System.out.println("消费者 " + Thread.currentThread().getName() + "已空");
                try{
                    list.wait(); //为空就一直等
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.remove(); //不为空才能消费
            System.out.println("消费者 " + Thread.currentThread().getName() + "已删，剩余为" + list.size());
            list.notifyAll();
        }
    }
}

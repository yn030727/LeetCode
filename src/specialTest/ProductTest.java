package specialTest;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class ProductTest {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int MAX_PRODUCE = 5;
        new Thread(() -> {
            while (true){
                synchronized (linkedList){
                    while(linkedList.size() > MAX_PRODUCE){
                        try {
                            linkedList.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    linkedList.addLast(1);//生成一个产品
                    System.out.println("");
                    linkedList.notify();
                }
            }
        }).start();
        new Thread(() -> {
            while (true){
                synchronized (linkedList){
                    while (linkedList.isEmpty()){
                        try {
                            linkedList.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    linkedList.pollLast();
                    System.out.println("");
                    linkedList.notify();
                }
            }
        }).start();
    }
}

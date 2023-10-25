package specialTest;

import java.util.ArrayList;

public class DeanLock {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println("thread1 is running");
                synchronized (DeanLock.class) {
                    System.out.println("thread is block obj1");
                    Thread.sleep(1000);
                    synchronized (Object.class) {
                        System.out.println("thread is block ojb2");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("thread1 is running");
                synchronized (Object.class) {
                    System.out.println("thread is block obj1");

                    Thread.sleep(1000);
                    synchronized (DeanLock.class) {
                        System.out.println("thread is block ojb2");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
    public View find(View view1 , View view2){
        ArrayList<View> views1 = new ArrayList<>();
        ArrayList<View> views2 = new ArrayList<>();
        View ViewRoot1 = view1;
        View ViewRoot2 = view2;
        while(ViewRoot1.parent != null){
            ViewRoot1 = view1.parent;
            views1.add(ViewRoot1);
        }
        while(ViewRoot2.parent != null){
            ViewRoot2 = view2.parent;
            views2.add(ViewRoot2);
        }
        int i = views1.size() - 1;
        int j = views2.size() - 1;
        while(true){
            //当前不相等，说明相等
            if(views1.get(i) != views2.get(j)){
                return views1.get(i + 1);
            }else{
                //相等的情况，说明是公共的
                i--;
                j--;
            }
        }
    }
    static class View{
        View[] children;
        View parent;
    }
}

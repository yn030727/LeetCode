package Compilation;

public class DeanLock {
    public static void main(String[] args) {

        new Thread(() -> {
            try{
                System.out.println("Thread1 is running");

                synchronized (DeanLock.class){
                    System.out.println("Thread1 is block obj1");
                    Thread.sleep(1000);
                    synchronized (Object.class){
                        System.out.println("thread1 is block obj2");
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try{
                System.out.println("Thread2 is running");

                synchronized (Object.class){
                    System.out.println("Thread2 is block obj1");
                    Thread.sleep(1000);
                    synchronized (DeanLock.class){
                        System.out.println("thread2 is block obj2");
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }).start();
    }
}

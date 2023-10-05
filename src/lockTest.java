import java.util.concurrent.locks.Lock;

public class lockTest {
    static notReentrantLock lock = new notReentrantLock();
    static class notReentrantLock{
        public notReentrantLock(){}
        private static boolean isLock = false;
        public synchronized void lock() throws InterruptedException{
            while(isLock){
                wait();
            }
            isLock = true;
        }
        public synchronized void unlock(){
            isLock = false;
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        print();
    }

    public static void print() throws InterruptedException{
        lock.lock();
        doAdd();
        lock.unlock();
    }
    public static void doAdd() throws InterruptedException{
        lock.lock();
        System.out.println("doAdd");
        lock.unlock();
    }
}

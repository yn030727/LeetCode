import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    private static Callable<String> callable = new MyCallable();
    private static FutureTask<String> futureTask = new FutureTask<>(callable);

    public static void main(String[] args) {
        new Thread(futureTask , "有返回值的线程").start();
        try{
            try{
                System.out.println(futureTask.get());
            }catch (ExecutionException e){
                e.printStackTrace();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

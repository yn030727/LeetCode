import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        //返回执行当前Callable的线程名字
        return Thread.currentThread().getName();
    }
}

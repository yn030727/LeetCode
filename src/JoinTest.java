public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Girl girl = new Girl();
        Thread g = new Thread(girl);
        g.start();
        System.out.println("小亮开始排队打饭...");
        g.join();
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + "小亮打饭完成");
    }

    static class Girl implements Runnable{
        public Girl(){}

        @Override
        public void run() {
            System.out.println("Girl 开始排队打饭...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "Girl 打饭完成");
        }
    }
}

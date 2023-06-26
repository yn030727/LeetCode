package Compilation;

public class Consumer implements Runnable{
    private Factroy factroy;

    public Consumer(Factroy factroy){
        this.factroy = factroy;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(3000);
                factroy.consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

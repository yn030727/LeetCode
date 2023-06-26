package Compilation;

import java.beans.PropertyDescriptor;

public class Producer implements Runnable{
    private Factroy factroy;

    public Producer(Factroy factroy){
        this.factroy = factroy;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(1000);
                factroy.produce();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

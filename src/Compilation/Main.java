package Compilation;

public class Main {
    public static void main(String[] args) {
        Factroy factroy = new Factroy();
        Thread thread2 = new Thread(new Producer(factroy));
        Thread thread3 = new Thread(new Consumer(factroy));
        thread2.start();
        thread3.start();
    }
}

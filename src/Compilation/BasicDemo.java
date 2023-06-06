package Compilation;

public class BasicDemo {
    B b = new B();
    int y , z , sum;

    static class B{
        int value;
        final int get(){
            return value;
        }
    }

    public void foo(){
        y = b.get();
        //...
        z = b.get();
        sum = y + z;
    }
}

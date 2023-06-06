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

    //冗杂访问消除
    public void foo1(){
        y = b.value;
        //...
        z = y;
        sum = y + z;
    }

    //复写传播
    public void foo2(){
        y = b.value;
        //...
        y = y;
        sum = y + y;
    }

    public static void foo(Object object){
        if(object != null){
            System.out.println("do something");
        }
    }
    public static void testInline(String[] args){
        Object obj = null;
        foo(obj);
    }
}

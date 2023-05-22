public class ReferenceCountingtGC {

    public Object instance = null;

    public static final int _1MB = 1024 * 1024;

    //这个成员属性的唯一意义就是占点内存，以便在GC日志中看清楚是否回收过
    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC(){
        ReferenceCountingtGC objA = new ReferenceCountingtGC();
        ReferenceCountingtGC objB = new ReferenceCountingtGC();
        objA.instance = objB;
        objB.instance = objA;

        //假设在这发生GC，objA和objB能否被回收？
        System.gc();
    }
}

public class JavaVMStackSOF {

    private int mStackLength = 1;

    public void stackLeak(){
        mStackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();

        try{
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:" +oom.mStackLength);
            throw e;
        }
    }
}

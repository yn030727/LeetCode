public class Demo2Interface implements DemoInterface{
    @Override
    public void a2() {
        String str = "123";
        int x = 4 , y = 5;
        str = str + (x + y);
        System.out.println(str);
    }

    @Override
    public void home2() {

    }

    @Override
    public void visit() {

    }
}

public class thinCopy {
    public static void main(String[] args) throws CloneNotSupportedException{
        Father f = new Father("bigFather");
        Son s1 = new Son("son1" , 13);
        s1.father = f;
        Son s2 = s1.clone();

    }
}

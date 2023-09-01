import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    public static final long serialVersionUID = 231412412351515L;
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void test(){
    }
}

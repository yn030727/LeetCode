public class Son extends Object implements Cloneable {
    int age;
    String name;
    Father father;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }
    public Son(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    protected Son clone() throws CloneNotSupportedException {
        return (Son)super.clone();
    }
}

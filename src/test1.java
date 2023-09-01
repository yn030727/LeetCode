import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String[] args) {

//        String s = new String("abc");
//        String s1 = "abc";
//        String s2 = new String("abc");
//        StringBuilder sb = new StringBuilder();
//        Person.test();

        List<String> list = new ArrayList<>();
        list.add("1111");
        list.add("1111");
        list.add("1111");
        list.add("222");
        list.add("222");
        list.add("222");
        list.add("1111");
        list.add("1111");


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == 4) {
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }

}

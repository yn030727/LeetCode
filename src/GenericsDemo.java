import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> iList = new ArrayList<Integer>();
        ArrayList<String> sList = new ArrayList<String>();
        ArrayList list; //裸类型
        list = iList;
        list = sList;
    }

//    public static String method(List<String> list){
//        System.out.println("invoke method String");
//        return "";
//    }
    public static int method(List<Integer> list){
        System.out.println("invoke method Integer");
        return 1;
    }

    public static void aiBox(){
        List<Integer> list = Arrays.asList(1,2,3,4);
        int sum = 0 ;
        for(int i : list){
            sum += i;
        }
        System.out.println(sum);
    }
}

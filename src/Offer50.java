import java.util.HashMap;

public class Offer50 {
    public char firstUniqChar(String s){
        HashMap<String , Boolean> hashMap = new HashMap<>();
        for(char s1 : s.toCharArray()){
            //只有第一次进去是false、之后全是true
            hashMap.put(String.valueOf(s1), !hashMap.containsKey(s1));
        }
        for(char s1 : s.toCharArray()){
            if(hashMap.get(s1)){
                return s1;
            }
        }
        return ' ';
    }
}

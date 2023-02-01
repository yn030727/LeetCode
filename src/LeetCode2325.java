import java.util.HashMap;
import java.util.HashSet;

public class LeetCode2325 {
    //解题思路：运行哈希表，将key值和字母顺序存入到哈希表中
    public String decodeMessage(String key, String message) {
        //HashMap的key值是 key字符串上的
        HashMap<Character,Character> hashMap = new HashMap<>();
        int temp = 0;
        for(int i=0 ; i<key.length() ; i++){
            if(key.charAt(i) != ' ' && hashMap.containsKey(key.charAt(i))){
                //将值放入到哈希表中
                System.out.println("" + ('a' + temp) + "   "  + key.charAt(i));
                hashMap.put(key.charAt(i),(char) ('a' + temp));
                temp++;
            }
        }
        char[] str = message.toCharArray();
        for(int i=0 ; i<str.length ; i++){
            if(str[i] != ' '){
                if(hashMap.get(str[i]) != null){
                    str[i] = hashMap.get(str[i]);
                }
            }
        }
        return new String(str);
    }
}

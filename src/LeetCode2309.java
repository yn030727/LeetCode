import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class LeetCode2309 {
    //解题思路：同时有大写还有小写.通过哈希表可以来解决这道题
    public String greatestLetter(String s) {
        HashSet<Character> hashSet = new HashSet();
        char str = ' ';
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) <= 'Z' && s.charAt(i)>= 'A'){
                //是大写字母
                if(hashSet.contains((char)(s.charAt(i) + 32))){
                    //已经有小写字母
                    if(s.charAt(i) > str){
                        str = s.charAt(i);
                    }
                }else{
                    //还没有小写字母
                    hashSet.add(s.charAt(i));
                }
            }else{
                //小写字母
                if(hashSet.contains((char)(s.charAt(i) - 32))){
                    //已经有大写字母
                    if(s.charAt(i) - 32 > str){
                        str =(char)(s.charAt(i) - 32);
                    }
                }else{
                    //还没有大写字母
                    hashSet.add(s.charAt(i));
                }
            }

        }
        return String.valueOf(str);
    }
}

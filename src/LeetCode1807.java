import java.util.HashMap;
import java.util.List;

public class LeetCode1807 {
    public static void main(String[] args) {

    }

    //解题思路：使用哈希表的方法可以处理这个问题
    public String evaluate(String s, List<List<String>> knowledge) {
        //将Konwledge里面要替换的键值对添加到hashMap集合里面
        HashMap<String , String> hashMap = new HashMap<>();
        StringBuilder res = new StringBuilder();
        for(int i=0 ; i<knowledge.size() ; i++){
            hashMap.put(knowledge.get(i).get(0) , knowledge.get(i).get(1));
        }
        char[] str = s.toCharArray();
        for(int i=0 ; i<s.length() ; i++){
            if(str[i] == '('){
                //temp标记左括号开始的位置
                StringBuilder sb = new StringBuilder();
                while(str[i] != ')'){
                    if(str[i] == '('){
                        i++;
                    }
                    sb.append(str[i]);
                    i++;
                }
                String string = sb.toString();
                if(hashMap.containsKey(string)){
                    //如果包含在当前集合当中
                    res.append(hashMap.get(string));
                }else{
                    res.append("?");
                }
            }else{
                res.append(str[i]);
            }
        }
        return res.toString();
    }
}

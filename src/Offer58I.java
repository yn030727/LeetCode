import java.util.*;

public class Offer58I {
    //1.使用语言特性
    public String reverseWords1(String s){
        //去除开头和末尾的空白字符
        s = s.trim();
        //split("s") 以字符s为分隔线  split("\s") 以碰到的每个空格、换行符、回车为分隔线。如果有连续多个以上的，就会连续划分。
        //split("\\s+") 以每个空格、换行符、回车为分隔线，相邻的多个以上的，就会视为一个。
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        //反转集合
        Collections.reverse(wordList);
        //连接
        return String.join(" " , wordList);
    }

    //2.双端队列
    public String reverseWords2(String s){
        int left = 0 , right = s.length() - 1;

        //去掉字符串开头和末尾的空白字符
        while(left <= right && s.charAt(left) == ' '){
            ++left;
        }
        while(left <= right && s.charAt(right) == ' '){
            --right;
        }

        //创建双端队列
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder word = new StringBuilder();

        while(left <= right){
            char c = s.charAt(left);
            if(word.length() != 0 && c == ' '){
                //双端队列中加入当前单词
                deque.offerFirst(word.toString());
                //清空StringBuilder单词
                word.setLength(0);
            }else if(c != ' '){
                word.append(c);
            }
            left++;
        }
        deque.offerFirst(word.toString());
        return String.join(" " , deque);
    }
}

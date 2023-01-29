public class LeetCode2315 {
    //通过题目分析，我们可以使用模拟的思路来处理问题
    //只要判断当前是第一个|号，那么直到下一个|号出现前，都不记录
    public int countAsterisks(String s){
        boolean isFirst = false;
        int number = 0;
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '|'){
                if(isFirst){
                    //第一个|号对结束
                    isFirst = false;
                }else{
                    isFirst = true;
                }
            }
            if(s.charAt(i) == '*'){
                if(!isFirst){
                    number++;
                }
            }
        }
        return number;
    }
}

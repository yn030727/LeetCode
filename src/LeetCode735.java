import java.util.HashSet;

public class LeetCode735 {
    public static void main(String[] args) {

    }

    //解题思路：题目要求的是涵盖所有的可能性，而密码是实时判断的
    //也就是说对于第二个按理来说，密码是10 00 01 11 四个当中的任意一个，要求我们去满足所有的条件
    //当我们输入00的时候满足了00这个密码
    //接下来输入1变成001的时候满足了01这个密码
    //以此类推0011满足11  00110满足10  所以最短的条件是00110(其他三个答案类似)
    public String crackSafe(int n, int k) {
        HashSet<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        //初始化sb的长度
        for (int i = 0; i < n; i++) {
            sb.append("0");
        }
        set.add(sb.toString());
        //k^n表示所有的可能性(所有密码组合)
        while (set.size() < Math.pow(k, n)) {
            //temp表示的是接下来要更新新的末尾后缀(添加一个字符，所以将sb.length() - n + 1保存)
            String temp = sb.substring(sb.length() - n + 1);
            for (int j = k - 1; j >= 0; j--) {
                //找到符合当前密码组合的条件
                if (!set.contains(temp + j)) {
                    sb.append(j);
                    set.add(temp + j);
                    break;
                }
            }
        }
        return sb.toString();
    }
}

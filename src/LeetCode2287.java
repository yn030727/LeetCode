public class LeetCode2287 {
    //解题思路：计数,记录两个数组的所有的字符，然后搜索目标字符
    //记录
    public int rearrangeCharacters(String s, String target) {
        int[] number1 = new int[26];
        int[] number2 = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            number1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < target.length(); ++i) {
            number2[target.charAt(i) - 'a']++;
        }
        //最多只有10*10一百种组合
        int ans = 100;

        for (int i = 0; i < 26; ++i) {
            if (number2[i] > 0) {
                //对于当前数来说，最多有几种可能
                //在使用这个可能和之前的最小值作比较
                //最后返回的是最小的可能
                ans = Math.min(ans, number1[i] / number2[i]);
            }
        }
        return ans;
    }
}

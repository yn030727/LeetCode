public class LeetCode1813 {
    class Solution {
        //解题思路：先找出两个句子中长的和短的，长的是目标句，短的是判断句
        //然后判断判断句从头往后和从后往前相对于 目标句相同字母的部分的长度
        public boolean areSentencesSimilar(String sentence1, String sentence2) {
            if(sentence1.length() > sentence2.length()){
                return JudgeSimilar(sentence2,sentence1);
            }else if(sentence1.length() < sentence2.length()){
                return JudgeSimilar(sentence1,sentence2);
            }else{
                if(sentence1.equals(sentence2)){
                    return true;
                }else{
                    return false;
                }
            }
        }

        //判断的函数
        public boolean JudgeSimilar(String cur , String target){
            char[] cur1 = cur.toCharArray();
            char[] target1 = target.toCharArray();
            int i = 0;
            int length1 = 0;
            boolean error1 = false;
            for(int a=0 ; a<cur1.length ; a++){
                if(cur1[a] == ' '){
                    error1 = true;
                }
            }
            while(i < cur1.length && cur1[i] == target1[i]){
                //如果相同就
                i++;
                length1++;
            }
            int j = cur.length() - 1;
            int temp = target.length() - 1;
            int length2 = 0;
            while(j >= 0 && temp >= 0 && cur1[j] == target1[temp]){
                j--;
                temp--;
                length2++;
            }

            if(length1 + length2 >= cur1.length){
                if(!error1){
                    //没有空格的情况
                    if(length1 !=0 && length2!= 0){
                        return false;
                    }
                }
                return true;
            }else{
                return false;
            }
        }
    }
}

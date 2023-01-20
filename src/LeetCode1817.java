import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode1817 {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        //先用哈希表记录所有要求的数据
        HashMap<Integer , Set<Integer>> hashMap = new HashMap<>();
        for(int i = 0 ; i<logs.length ; i++){
            hashMap.putIfAbsent(logs[1][0] , new HashSet<>());
            hashMap.get(logs[1][0]).add(logs[1][1]);
        }
        int[] answer = new int[k];
        //遍历整个哈希表
        for(Set<Integer> set : hashMap.values()){
            //当前用户的操作分钟
            int number = set.size();
            if(answer[number - 1] == 0){
                answer[number - 1] = 1;
            }
        }
        return answer;
    }
}

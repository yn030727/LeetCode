import java.util.Stack;

public class Offer31 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int length = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0 ; i < length ; i++){
            if(i != 0){
                while(stack.peek() == popped[j]){
                    stack.pop();
                    j++;
                }
                stack.push(pushed[i]);
            }else {
                stack.push(pushed[i]);
            }
        }
        while(stack.peek() == popped[j]){
            stack.pop();
            j++;
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}

package Compilation;

import java.util.LinkedList;

public class Offer30 {


}
class MinStack{
    LinkedList<Integer> linkedList ;

    public MinStack(){
        linkedList = new LinkedList<Integer>();
    }

    public void push(int x){
        linkedList.addLast(x);
    }

    public void pop(){
        linkedList.removeLast();
    }

    public int top(){
        return linkedList.getLast();
    }

    public int min(){
        int min = Integer.MAX_VALUE;
        for(int i : linkedList){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
}
import java.awt.*;
import java.util.Scanner;

public class LanQiao1 {
    private static long[] number;
    private static long left = 0;
    private static long right = 0;
    private static long min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        number = new long[16];
        int i = 1;
        while(sc.hasNext()) {
            number[i] = sc.nextLong();
            i++;
        }

        long t = dfs(0 , 0);
    }

    public static long dfs(int position, long num) {
        if(position == 15) {
            //传到最后一个数了
            num += number[position];
            return num;
        }
        num += number[position];
        long number1 = dfs(position+1, left);
        long number2 = dfs(position+1, right);
        if(Math.abs(number1 - number2) < min) {
            min = Math.abs(number1 - number2);
        }
        return 0;
    }
}

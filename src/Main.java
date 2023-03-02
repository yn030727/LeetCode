import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int Square = 0;
        int Rectangle = 0;
        //正方形的数量随着i和j的变化，体现出来的形式是 1X1 ：i*j   2X2 : (i-1)*(j-1)   3X3 : (i-2)*(j-2)
        int i = m , j = n ;
        int temp = 0;
        while(i-temp != 0 && j-temp != 0) {
            Square += (i - temp) * (j - temp);
            temp++;
        }
        int num1 = 0 , num2 = 0;
        while(i != 0) {
            num1 += i;
            i--;
        }
        while(j != 0) {
            num2 += j;
            j--;
        }
        Rectangle = num1 * num2 - Square;
        System.out.println(Square + " " + Rectangle);
    }
}

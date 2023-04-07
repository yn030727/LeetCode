import java.util.Scanner;

public class LanQiao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        n = n / 1000 ;
        long second = n;
        long minute = second / 60;
        long hour = minute / 60;
        System.out.format("%02d:%02d:%02d" ,hour % 24,minute % 60,second % 60);
    }
}
